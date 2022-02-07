Feature:   tuiana
  Scenario: User
    Given user is at home page
    When user enters username and password
    And press the Login Button
    Then user should see the dashboard
