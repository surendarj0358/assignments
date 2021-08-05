@debug
Feature: Todoist api

Background:
    * url baseUrl
    * configure headers = accessToken

Scenario: Get the user project
    Given path "/rest/v1/projects"
    When method get
    Then status 200

Scenario: Create a new project
    Given path "/rest/v1/projects"
    And request
    """
    {"name": "Shopping List"}
    """
    When method Post
    Then status 200
    Then match response == "#object"
    Then match response.name == "Shopping List"


Scenario: Update the project
    Given path "/rest/v1/projects/2270425939"
    And request
    """
    {"name": "Things To Shop"}
    """
    When method Post
    Then status 204

    
Scenario: Get a project
    Given path "/rest/v1/projects/2270425939"
    When method Get
    Then status 200
    Then match response == "#object"
    Then match response.name == "Inbox"

Scenario: Get all Tasks
    Given path "/rest/v1/tasks"
    When method Get
    Then status 200
    Then match response == "#array"
    
Scenario: Create Tasks
    Given path "/rest/v1/tasks"
    And request
    """
    {"content": "Buy Milk", "due_string": "tomorrow at 12:00", "due_lang": "en", "priority": 4}
        
    """
    When method Post
    Then status 200
    Then match response == "#object"
    Then match response.content == "Buy Milk"
    
Scenario: Close Tasks
    Given path "/rest/v1/tasks/5040970115/close"
    When method Post
    Then status 204

Scenario: Reopen Tasks
    Given path "/rest/v1/tasks/5040970115/reopen"
    When method Post
    Then status 204

Scenario: Delete Tasks
    Given path "/rest/v1/tasks/5030859886"
    When method Delete
    Then status 204  

Scenario: Create new label
    Given path "/rest/v1/labels"   
    And headers {Content-Type:'application/json'}
    And request
    """
         {"name": "Fruits"}
    """
    When method Post
    Then status 200
    
Scenario: Get label
    Given path "/rest/v1/labels"
    And headers {Content-Type:'application/json'}
    When method Get
    Then status 200

Scenario: Update label
    Given path "/rest/v1/labels/2157753339"
    And headers {Content-Type:'application/json'}
  
    And request
    """
        {"name": "Medicines"}
    """
    When method Post
    Then status 204 

            
Scenario: Delete label
    Given path "/rest/v1/labels/2157753339"
    And headers {Content-Type:'application/json'}
    When method Delete
    Then status 204