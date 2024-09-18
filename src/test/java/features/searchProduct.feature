Feature: Search Product
  This feature file is to test existence of product on offer page.
 
@searchproduct	 	
Scenario: Search product on home and offer page
  Given User is on home page
  When User enters shortname of product "Tom" and click offer page
  Then User enters shortname and see if same product exists
	

	
