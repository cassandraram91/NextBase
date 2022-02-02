Feature: User should be able to search people, documents and more from search box

Scenario: Verify users can search valid information from search box
  Given User is logged in as valid user
  When User Enters valid information
  Then User sees menu items and suggested modules below search box

Scenario: Another scenario
