Feature: US1006 How to use Configuration Properties File

#  To reach any value from configuration.properties file we need to use parameters.Scenario:
#  Then in the method we use that parameter to get the value from configuration.properties file

  Scenario: TC07 User goes to Amazon and tests they are on www.amazon.com

    Given User goes to "amazonURL" Homepage
    Then tests that the URL has "amazon" word
    Then closes the page

  Scenario: TC08 User goes to Amazon and tests they are on www.amazon.com

    Given User goes to "wqURL" Homepage
    Then tests that the URL has "wisequarter" word
    Then closes the page

  Scenario: TC09 User goes to Amazon and tests they are on www.amazon.com

    Given User goes to "facebookURL" Homepage
    Then tests that the URL has "facebook" word
    Then closes the page