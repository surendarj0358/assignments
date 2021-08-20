Feature: Registration Form

    Feature validate the registration page

    Scenario: using multiple data to validate the registration page
    Given navigate to login page
    Then verify the login page was loaded or not
    And click register
    Then verify the register page was loaded or not
    Then fill the registration Form

        | firstName  | secondName | email          |mobileNo   |address  | city      |state      |postalCode |country  |addressline2|
        | surendar   | kumar      | user@email1.com|1234566890 |address1 | HYBD      |Telangana  |623466     |India    |street1     |
        | siva       | prasad     | user@email2.com|1454567890 |address2 | Chennai   |Tamil Nadu |623346     |India    |street2     |
       
       

