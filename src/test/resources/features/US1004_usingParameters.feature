Feature: US1004 Using parameters in test steps

#    If we want to create a dynamic method we can enter parameters when we create the method
#    we should enter parameter between double quotes

#    After preparing the methods' names we need to create them in a stepDefinition class
#    To create them there are a few ways

#    1) we can come over it and create the method from popup message
#    2) we can run the test and system will print missing methods on colse so we can get the methods from the console

#    This will create a parameter gate which can receive value from method text
#    so we can change the parameter and use the method

  Scenario: TC04 We will create new methods where we can use parameters
    Given User goes to Amazon Homepage
    Then user searches for "Java" in the search box
    And tests that result text contains "Java"
    Then closes the page

  Scenario: TC05 searches for Teapot
    Given User goes to Amazon Homepage
    Then user searches for "Apple" in the search box
    And tests that result text contains "Apple"
    Then closes the page

  Scenario: TC06 searches for Flower
    Given User goes to Amazon Homepage
    Then user searches for "TV" in the search box
    And tests that result text contains "TV"
    Then closes the page

