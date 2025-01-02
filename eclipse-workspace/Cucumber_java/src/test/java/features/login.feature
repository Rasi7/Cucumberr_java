Feature:login
Scenario: Validate user is able to login using valid credentails
 
 Given Browser is open and url is navigated
 And Login page is displayed
 When user enter valid username and valid password
 And user clicks on login button
 Then User should be sucessfully logged in
 And Broswe should close