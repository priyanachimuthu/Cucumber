Feature: Home Screen Feature

  Background: 
    Given User has opened the Simplilearn application
    When User enters correct username "<UserName>"
    And User enters correct password "<Password>"

  Scenario: Verify the user is able to see the product details
    Given user has landed on home screen
    When when user do some browsing
    Then they should be able to see some products

  Scenario: Verify the user is able to see the product details
    Given user has landed on home screen
    When when user do some browsing
    Then they should be able to see some products
