Feature: click compose
  
  Scenario: Compose button verification
   
   Given I need to login to gmail site with valid credentials
   Then compose button is displayed
   When clicked on compose button
   Then new message pop up is displayed