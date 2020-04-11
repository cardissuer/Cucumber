  @Regression
  Feature: Google feature verifications
  Agile Story: User Stories,acceptance criteria
  Basically we can pass here any additional information related to this feature file
  #comments are done using hashtag sign in feature file

  @smokeTest @google
  Scenario: Google title verification
    When User is on google homepage
    Then User should see title contains Google

    @miniRegression @google
    Scenario: Google Title verification after search
    When User is on google homepage
    Then User types wooden spoon into the search box
    And User clicks on search button
    And User should see wooden spoon in the title

    #Sergey files
    @regression
    Feature: Google feature verifications
    Agile Story: User stories, acceptance criteria
    Basically we can pass here any additional information related to this feature file
  #comments are done using hashtag sign in feature file
    @smokeTest
    Scenario: Google title verification
      When User is on google homepage
      Then User should see title contains Google
    @miniRegression
    Scenario Outline: Google title verification after searching a term
      When User is on google homepage
      And User types "<criteria>" into the search box
      And User clicks to search button
      Then User should see "<criteria>" in the title
      Examples:
        | criteria     |
        | wooden spoon |
        | silver spoon |