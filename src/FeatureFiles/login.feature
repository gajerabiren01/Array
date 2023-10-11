Feature: As a user when i login to my account i can use index facility

  Scenario: user should be logged in with valid credentials
    Given user is on the login page
    When user type username as "johnmarsh@gmail.com"
    And  user type password as "Test1234"
    And user click on login button
    Then user should be logged in
    And user should see a welcome user message

  Scenario: user should not be logged in with valid username and invalid password
    Given user is on the login page
    When user type username as "johnmarsh@gmail.com"
    And  user type password as "Test123"
    And user click on login button
    Then user should not be logged in
    And user should see a error message

  Scenario: user should not be logged in with invalid username and valid password
    Given user is on the login page
    When user type username as "johnmarsh01@gmail.com"
    And  user type password as "Test1234"
    And user click on login button
    Then user should not be logged in
    And user should see a error message

  Scenario: user should not be logged in with empty username and valid password
    Given user is on the login page
    When username is empty
    And  user type password as "Test1234"
    And user click on login button
    Then user should not be logged in
    And user should see a error message

  Scenario: user should not be logged in with valid username and empty password
    Given user is on the login page
    When user type username as "johnmarsh@gmail.com"
    And  password is empty
    And user click on login button
    Then user should not be logged in
    And user should see a error message

  Scenario: user should not be logged in with invalid username and invalid password
    Given user is on the login page
    When user type username as "johnmarsh01@gmail.com"
    And  type password "Test"
    And user click on login button
    Then user should not be logged in
    And user should see a error message


