

Feature: validate login features of orange hrm.

@login
  Scenario: validate login features of orange hrm using valid credentials

    Given open browser
    When enter url
    When verify login page loaded or not
    When enter username as "Admin"
    And enter password as "admin123"
    And click login button
    Then verify login sucess or not
