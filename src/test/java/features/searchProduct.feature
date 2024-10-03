Feature: Search Product
  This feature file is to test existence of product on offer page.
 
@searchproduct	 	
Scenario: Search product on home and offer page
  Given User is on home page
  When User enters shortname of product "Tom" and extract the name
  Then User enters same shortname "Tom" in offer page and see if same product exists
	

	
@searchproductScenarioOutlineExmaple	 	
Scenario Outline: Search product on home and offer page
  Given User is on home page
  When User enters shortname of product <Name> and extract the name
  Then User enters same shortname <Name> in offer page and see if same product exists
  
Examples:
|Name|
|Tom| 
|Beet|