  @Regression
  Feature: Google feature verifications
  Agile Story: User Stories,acceptance criteria
  Basically we can pass here any additional information related to this feature file
  #comments are done using hashtag sign in feature file

  @smokeTest
  Scenario: Google title verification
    When User is on google homepage
    Then User should see title contains Google

    @miniRegression
    Scenario: Google Title verification after search
    When User is on google homepage
    Then User types wooden spoon into the search box
    And User clicks on search button
    And User should see wooden spoon in the title