Feature: Product Feature
  
  Description: Helps to add products to the cart in SwagLabs Application

  Background: 
    Given User_pf has opened the SwagLabs applications
    When User_pf enters correct username "standard_user"
    And User_pf enters correct password "secret_sauce"
    And User_pf clicks on Login button

  @ProductFeature
  Scenario Outline: User can able to add a Single product to the cart
    Given User_pf should be landed on the Products Page
    And User_pf selects a single product and User Click Add to Cart button "<Product>"
    Then User_pf should be able to view the product in Mycart

    Examples: 
      | Product                 |
      | Sauce Labs Bolt T-Shirt |

  @DataTable
  Scenario Outline: User can able to add Multiple products to the cart
    Given User_pf should be landed on the Products Page
    And User_pf selects multiple products and User Click Add to Cart button
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Backpack      |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
    Then User_pf should be able to visualize the product in Mycart
