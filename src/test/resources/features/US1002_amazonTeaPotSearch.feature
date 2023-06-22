Feature: US 1002 Tea Pot Search

  Scenario: User will search for teapot on Amazon



    Given User goes to Amazon Homepage
    Then user searches for TeaPot in search box
    And tests that the result contains TeaPot word
    Then closes the page