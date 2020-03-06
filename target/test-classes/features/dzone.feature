Feature: dZone links comparison

@headerComparison
Scenario: User checks the dZone pages links
When  user goes to "https://dzone.com/articles/gradle-vs-maven" and takes header
And user goes to "https://dzone.com/agile-methodology-training-tools-news" and takes header
Then user compares two headers