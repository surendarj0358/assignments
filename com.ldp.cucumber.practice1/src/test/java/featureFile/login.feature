@debug
Feature: validate login features of orange hrm.

  @login
Scenario Outline: validate registeration form using multiple data

    Given open browser
    When enter url
    Then verify login page loaded or not
    When enter mail id as "<email>"
    Then  click login
    Then verify registeration form page loaded or not
    Then fill the registration form

        | surendar   | kumar      | address1 | user@email1.com | 1234567890 |Java      |India   |2001|Jan  |1|
        | siva       | prasad     | address2 | user@email2.com | 1235567890 |Linux     |India   |2002|Feb  |2|


    Examples:
      | email |
      | incomtax@email.com   |
      | bank@email.com       |




