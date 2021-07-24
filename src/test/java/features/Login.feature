@LoginFeature
Feature: Login Feature
  Description: This feature will be used to login to Simplilearn Application

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Simplilearn application
    When User click on the Login Button
    And User enters correct username "<UserName>"
    And User enters correct password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home Page
    And User should be able to see the welcome message

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | abc123   |

  @NegativeLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Simplilearn application
    When User click on the Login Button
    And User enters correct username "<UserName>"
    And User enters correct password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home Page
    And User should be able to see the welcome message

    Examples: 
      | UserName    | Password |
      | sangee@xyz.com | abc123   |