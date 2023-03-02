Feature: Login
 Background:Go to login page
   Given User is on login page

  @smoke
  Scenario: Valid Login
    When User enters credentials
    And User clicks on login button
    Then User lands to homepage

  @regression
  Scenario Outline: Invalid Login
    When User enters <username> and <password>
    And User clicks on login button
    Then User lands to homepage

    Examples:

    |   username  |     password        |
    |   user1     |     12345           |
    |   user2     |     12345           |

