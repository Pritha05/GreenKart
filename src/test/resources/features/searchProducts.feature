Feature: Search and Place the order for product

  Scenario Outline: Search product in both home and offers page
    Given the user is on greenKart landing page
    When user search with shortname <shortname> and extracted actual name of the product
    Then user clicks on add to cart
    Then user clicks on bag
    Then user clicks proceed to checkout
    Then user clicks place an order
    Then user selects on country 
    And user clicks on proceed
    

    Examples:
      | shortname |
      | tom       |
      
      

