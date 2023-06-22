Feature: US1005 Using parameters in test steps

#  IF you are planing to use same steps at the beginning of each Scenario, you can use Background
#  Whatever method you use here will be executed before each Scenario
#  So we don't need to write same beginning steps again and again in each Scenario

  Background: Before each Scenario this method will be executed
    Given User goes to Amazon Homepage

  Scenario: TC04 We will create new methods where we can use parameters
    Then user searches for "Java" in the search box
    And tests that result text contains "Java"
    Then closes the page

  Scenario: TC05 searches for Teapot
    Then user searches for "Apple" in the search box
    And tests that result text contains "Apple"
    Then closes the page

  Scenario: TC06 searches for Flower
    Then user searches for "TV" in the search box
    And tests that result text contains "TV"
    Then closes the page