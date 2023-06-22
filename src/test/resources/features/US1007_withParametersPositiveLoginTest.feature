Feature: US1007 Positive Login Test
#  @wip

  Scenario: TC10 Positive Login test with valid username and password

    Given User goes to "qdURL" Homepage
    Then user clicks on qdHomepage login button
    Then user inputs a valid email to emailBox
    And user inputs a valid password to passwordBox
    And user clicks on loginPage login button
    Then test that user could login