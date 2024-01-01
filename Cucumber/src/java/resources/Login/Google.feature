Feature: To test login credentials


  @Smoke
  Scenario Outline: Check whether search is successful or not
    Given user is in google page
    When user enters the <text> in the search area
    And Clicks on google search
    Then user redirects to google page

    Examples: 
      | text   |
      | Ujjwal |
      | india  |
      
      
      
        @Important
  Scenario Outline: Check whether search is successful or not
    Given user is in google page
    When user enters the <text> in the search area
    And Clicks on google search
    Then user redirects to google page

    Examples: 
      | text   |
      | Ujjwal |
      | india  |
      
