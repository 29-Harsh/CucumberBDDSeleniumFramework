#Feature file is nothing but collection of mulitple test cases/scenarios.
#Consider feature file is a test suite and scenrios under are test cases / Business requirements

#Author: harshgr81@gmail.com


Feature: Application login
  This feature file is to test login process of sauce labs webiste.

  Scenario: Admin login
    Given Admin is on login page
    When Admin enters credentials
    Then Display Home page

