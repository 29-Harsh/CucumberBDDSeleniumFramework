#Feature file is nothing but collection of mulitple test cases/scenarios.
#Consider feature file is a test suite and scenrios under are test cases / Business requirements

#Author: harshgr81@gmail.com


Feature: Application login
  This feature file is to test login process of sauce labs webiste.


#Scenario: Admin login
#  Given Admin is on login page
#  When Admin enters credentials
#  Then Display Home page

#while you have same type of scenario for diff data
#for e.g wehave n user to login, so instead of writing multiple scenario, use scenario outline where we can paramatrize

#Parameterization in cucumber scenario
#Use this when you want to run same testcase with different data sets having same behaviour
Scenario Outline: User login
  Given Admin is on login page
  When Admin enters credentials username "<User>" and password "<Pass>"
  Then Display Home page
  
#if you want to pass any other data type alphanumeric paramter 
#use regex  
  
 Examples:
 	|User|Pass|
 	|CreditUser|1234|
 	|DebitUser|2341| 
 	
 	
#In case you want to fill up form, so it's not good idea to pass multiple dat in single line. 
#When Admin enters credentials username "<User>" and password "<Pass>"
#Use this when you want to pass multiple data in same step.
Scenario: User signup
  Given User is on signup page
  When User enters credentials
	|filling|
	|the |
	|Signup|
	|page|
 Then Display Home page
