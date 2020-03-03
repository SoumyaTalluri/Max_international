Feature: Max_International home screen
@sigin
Scenario: [Login_01] To verify user is able to navigate at the login page
Given User is in welcome page 
Then Select language and location
Then click on member login button
Then Title of page is login

@test
Scenario: [Login_02,03,04,05] To verify user is able to enter valid credentials and login successfully
Given User is in welcome page 
Then Select language and location
Then click on member login button
Then Title of page is login
Then enter username and password
And click on login


Scenario Outline: [Login_06] To verify user is able to click the password field
Then enter the <username> and <password>
And click on login
And Error message appears 


Examples:
        | username | password |
        | fakejeff | 12345 |
