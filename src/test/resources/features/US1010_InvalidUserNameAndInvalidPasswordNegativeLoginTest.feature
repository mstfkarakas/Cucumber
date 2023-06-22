Feature: US1010 Negative Login test with a few InvalidUserMail and InvalidUserPassword

#  @wip

  Scenario Outline: TC15 Try to login with a lot of invalid userMail and password

    Given User goes to "qdURL" Homepage
    Then user clicks on qdHomepage login button
    Then user inputs "<InvalidEmail>" to emailBox
    Then user inputs "<InvalidPassword>" to passwordBox
    And waitFor 1 seconds
#    If you input a number, it's automatically a paramteter. We use "" for string values
    And user clicks on loginPage login button
    Then test that user could not login
    Then closes the page

    Examples:
      | InvalidEmail          | InvalidPassword      |
      | asdfasdf@asdf.com     | 654asdfasdEsdf.      |
      | asdsdfasdf@asdf.com   | 654aswerdfasdEsdf.   |
      | asdsdfasdf@asdsdf.com | 654aswerdfawesdEsdf. |
      | 234@asdsdf.com        | 654as234fawesdEsdf.  |
      | 234@as435sdf.com      | 654as234fa24Esdf.    |
      | 234@as432333df.com    | 654as23433Esdf.      |


