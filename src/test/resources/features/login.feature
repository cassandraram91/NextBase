
Feature: Login functionality

  @login
  Scenario: User login to application with valid credentials
    Given user is on login home page
    When user enters valid username
    And user enters valid password
    And user click login button
    Then user successfully logins to application