

Feature: US1008 Negative Login Test

  Scenario: TC11 Negative Login Test with valid Email and Invalid Password

    Given User goes to "qdURL" Homepage
    Then user clicks on qdHomepage login button
    And user inputs a valid "qdValidUsername" to emailBox
    And user inputs an invalid "qdInvalidPassword" to passwordBox
    And user clicks on loginPage login button
    And test that user could not login
    And closes the page


  Scenario: TC12 Negative Login Test with Invalid Email and Valid Password

    Given User goes to "qdURL" Homepage
    Then user clicks on qdHomepage login button
    And user inputs a valid "qdInValidUsername" to emailBox
    And user inputs an invalid "qdValidPassword" to passwordBox
    And user clicks on loginPage login button
    And test that user could not login
    And closes the page

  Scenario: TC13 Negative Login Test with Invalid Email and Invalid Password

    Given User goes to "qdURL" Homepage
    Then user clicks on qdHomepage login button
    And user inputs a valid "qdInValidUsername" to emailBox
    And user inputs an invalid "qdInvalidPassword" to passwordBox
    And user clicks on loginPage login button
    And test that user could not login
    And closes the page