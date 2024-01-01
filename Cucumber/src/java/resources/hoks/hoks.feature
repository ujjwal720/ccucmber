Feature: To test login credentials



  Scenario Outline: Check whether sea is successful or not
    Given user is in goog page
    When user enters the <text> in the se area
    And Clicks on gooe search
    Then user redi to google page

    Examples: 
      | text   |
      | Ujjwal |
      | india  |
      
      
      

      
