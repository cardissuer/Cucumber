Feature: Negative scenarios for POST API request for Bena

  @BenaScenario
  Scenario Outline: API upload negative scenario
    And user goes to testing application
    Then user uploads 64 MB files "<file type>"
    And user validates on API how many of them were uploaded

    Examples:
      | resource        | file type |
      |/uploads folder/ | doc       |
      |/uploads folder/ | txt       |
      |/uploads folder/ | pdf       |
      |/uploads folder/ | excel     |
      |/uploads folder/ | jpeg      |
      |/uploads folder/ | bmp       |
      |/uploads folder/ | png       |
      |/uploads folder/ | csv       |
      |/uploads folder/ | ini       |