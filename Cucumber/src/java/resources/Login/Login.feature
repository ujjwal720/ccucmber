Feature: To test login credentials

  Scenario Outline: Check whether login is successful or not.
    Given user is on login page
    When user enters the <username> and <password>
    And Click on Login button
    Then user is navigated to Homepage.

    Examples: 
      | username | password |
      | test1    | test3    |
