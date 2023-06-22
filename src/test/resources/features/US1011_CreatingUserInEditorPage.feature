@US1011 @p1
Feature: US1011 Creating Users

#  @wip

  Scenario Outline: TC16 Creating a lot of users in editor page

    Given User goes to "editorUrl" Homepage
    Then user clicks on NEW button
    Then user enters "<firstName>" to firstName box
    Then user enters "<lastName>" to lastName box
    Then user enters "<position>" to position box
    Then user enters "<office>" to office box
    Then user enters "<extension>" to extension box
    Then user enters "<startDate>" to startDate box
    Then user enters "<salary>" to salary box
    And  user clicks on create button
    And  user sends the "<firstName>" to search box
    Then tests that user's "<firstName>" is in the list
    Then closes the page
    Examples:
      | firstName | lastName | position  | office | extension | startDate  | salary |
      | Ahmet     | Brown    | QA        | USA    | Canada    | 2023-05-20 | 2500   |
      | Hasan     | Yellow   | Director  | Eu     | Eng       | 2023-05-05 | 3000   |
      | Murat     | Black    | Developer | Eu     | TR        | 2022-05-03 | 3500   |
#      | Ali       | Can      | QAAAA     | USA    | Canada    | 2021-01-03 | 2500   |  Didn't work for no reason.
      | Ayse      | Flower   | QAP       | AU     | Tex       | 2023-05-03 | 4000   |
      | Elcin     | Brown    | QAT       | UAE    | Canada    | 2020-05-03 | 2500   |

