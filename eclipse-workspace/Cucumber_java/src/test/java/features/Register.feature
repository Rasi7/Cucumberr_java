Feature: Register
Scenario: User should able to register using valid credentails
#Given Browser is open
#And url is navigated to register page
#When user enter valid credantials
#And clicks on register button
#Then a new account should be created
#And brower must be closed
Given Broswer is open
And url is navigated to register page
When user enters valid credentails
|F| Rasi|kota|rasi2344@gmail.com|123456778|
 And click on register button
 Then a new Account should be created
 And brower must be closed
 
