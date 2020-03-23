Feature: Teacher Details End to End UI vs API

  @e2e
  Scenario Outline: UI vs API cross data validation
    And user goes to Cybertek training application
    Then user opens teacher profile details page "<teacher ID>"
    And user cross validates teacher details on API and UI

    Examples:
      | resource     | teacher ID |
      |/teacher/2625 | 2625       |