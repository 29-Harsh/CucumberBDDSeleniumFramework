#this feature file is to undersatnd about hooks concept in cucumber.
# When scenarios have common pre requisite steps we can use backgroud concept but
#if one scenario has some thing else to do before and second scenario has something else to perform.
#then we use Hooks, which helps us to handle the partial behaviour of scenarios.
#Also, Background is specific to only one feature file. However, one hooks class can be use for all feature files.

#let's say below scenarios points to diff db before running futher steps.

#Given: create entry into database  - so remove this step from background and use it in hooks. 

Feature: Application login hooks concept
  This feature file is to test login process of sauce labs webiste.

Background:
	When: when user opens browser from config variables

 	
@smoketest @regressiontest @insurance
Scenario: User login
  Given Admin is on insurance login page
  When Admin enters credentials username "randonUser" and password "randomPass"
  Then Display Home page
  
@smoketest @negativetest  @regressiontest @mortgage
Scenario: User login
  Given Admin is on mortgage login page
  When Admin enters credentials username "ExUser" and password "ExPass"
  Then Display Home page