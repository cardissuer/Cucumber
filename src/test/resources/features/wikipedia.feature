Feature: Wikipedia search functionality
  ​
  Background: User is on Wikipedia home page
    Given User is on Wikipedia home page

  @wiki1
  Scenario: Wikipedia search title verification
    When User types Steve Jobs in the wiki search box
    Then User clicks wiki search button
    And User sees Steve Jobs is in the wiki title

  @wiki2
  Scenario: Wiki search header verification
    When User types Steve Jobs in the wiki search box
    Then User clicks wiki search button
    And User sees Steve Jobs is in the main header

  @wiki3
  Scenario: Wiki search image header verification
    When User types Steve Jobs in the wiki search box
    Then User clicks wiki search button
    And User sees Steve Jobs is in the image header

  @myScenarioOutline
  Scenario Outline: Wiki search image header verification
    When User types "<searchValue>" in the wiki search box
    Then User clicks wiki search button
    And User sees "<expectedValue>" is in the image header

    Examples: different data sets
    #command option L for mac
    #ctrl alt L for windows

      | searchValue | expectedTitle |
      | Steve Jobs  | Steve Jobs    |
      | Bob Hope    | Bob Hope      |
      | Johnny Cash | Johnny Cash   |
      | Kevin Bacon | Kevin Bacon   |

     # WORK ON THE LAST SCENARIO IN WIKI FEATURE TO MAKE IT SCENARIO OUTLINE
  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality ImageHeader Verification
    When User is on Wikipedia home page
    And User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedValue>" in the image header
    Examples: Test data for image header verification
      | searchValue  | expectedValue |
      | Steve Jobs   | Steve Jobs    |
      | Bill Gates   | Bill Gates    |
      | Donald Trump | Donald Trump  |
      | Ricky Martin | Ricky Martin  |
      | Esen Niiazov | Esen Niiazov  |

  @wiki

  Scenario: Wikipedia Search Functionality Title Verification
    When User is on Wikipedia home page
    And User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    When User is on Wikipedia home page
    And User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the main header

  Scenario: Wikipedia Search Functionality ImageHeader Verification
    When User is on Wikipedia home page
    And User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the image header