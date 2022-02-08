Feature: search functionality

  Scenario: User should be able to search people, documents and more from search box
    Given User is on dashboard page
    When User Enters valid information in search box
    Then User sees menu items and suggested modules below search box