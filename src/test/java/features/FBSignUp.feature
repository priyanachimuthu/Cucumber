Feature: Fb SignUp Feature to validate the add new user functionality

  Scenario Outline: Verify that user is able to create the new Account
    Given User has launched the FB application
    When User clicks on the Create New Account Link
    And User enters "<FirstName>" "<LastName>" "<MobileNum>" and "<Password>"
    And User selects "<Month>" "<Date>" and "<Year>"
    And User click on the SignUp button
    Then user should be able to see the success message

    Examples: 
      | FirstName | LastName | MobileNum  | Password   | Month | Date | Year |
      | Raj       | Sharma   | 9999999999 | abc123@abc |     8 |   12 | 1990 |

  @DataTable
  Scenario: Verify that user is able to create the new account using cucumber datatable
    Given User has launched the FB application
    When User clicks on the Create New Account Link
    And User creates the new account
      | Field      | Value      |
      | FirstNaame | Raj        |
      | LastName   | Sharma     |
      | MobileNum  | 9999999999 |
      | Password   | abc@abc123 |
    And User click on the SignUp button
    Then user should be able to see the success message
