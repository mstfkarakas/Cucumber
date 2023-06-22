Feature: US1012 Website Wait Test

  @p2

  Scenario: TC17 User should wait to see buttons

    Given User goes to "herOkuAppUrl" Homepage
    Then  user clicks on addElement button
    And   user waits until delete button appears
    Then  tests that delete button is visible
    And   deletes delete button by clicking delete button
    Then  tests that delete button is not visible
    And   closes the page