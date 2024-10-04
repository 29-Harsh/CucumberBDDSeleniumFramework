Feature: Checkout Product
  This feature file is to test cart and checkout functionality.
 
@checkoutProduct	 	
Scenario Outline: Add product to card and proceed to checkout 
  Given User is on home page
  When User enters shortname of product <Name> and extract the name
  And Add items to cart and proceed to checkout
  Then Verify same product exists in cart page
  And Validate order place succesfully
  
Examples:
|Name|
|Tom|