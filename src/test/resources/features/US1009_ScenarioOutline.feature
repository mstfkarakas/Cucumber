@p2

Feature: US1009 To test more than one data, use Scenario Outline

  Scenario Outline: TC14 amazon Search Test

    Given User goes to "amazonURL" Homepage
    Then user searches for "<Items>" in the Amazon search box
    And tests that result text contains "<Items>" word
    Then closes the page

    Examples:
      | Items   |
      | Java    |
      | Apple   |
      | Math    |
      | Samsung |
      | TV      |












