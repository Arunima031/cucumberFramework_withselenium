Feature: Search in google
  @smoke
  Scenario: basic Search
    When User opens google
    When User enters the search item
    And User hits enter
    Then Search results open
    And user clicks on online courses
    And User chooses course of interest

