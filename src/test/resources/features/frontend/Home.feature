Feature: Max_International home screen
@sigin
Scenario: [Login_01] To verify user is able to navigate at the login page
Given User is in welcome page 
Then  Select language and location
Then click on member login button
Then  Title of page is login
Then enter username and password
And click on login