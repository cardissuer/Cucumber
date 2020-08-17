 @googletest
  Scenario: Google results verification
    When User is on google homepage
    Then User types 504,000,000 results into the search box
    And User clicks on search button
    And User should see results near the search box