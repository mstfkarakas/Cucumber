Feature: US 1001 User will search Nutella on Amazon

  Scenario: TC01 USer will search for Nutella

    Given User goes to Amazon Homepage
    Then user searches for Nutella in the search box
    And tests that result text contains Nutella
    Then closes the page

#    in feature section we need enter user story
#   in scenario we should write the test case