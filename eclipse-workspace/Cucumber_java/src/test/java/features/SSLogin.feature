Feature: SSLogin
Scenario: Validate shopper can login using valid credentials
Given broswer will open and url navigated
And Login page will be displayed
And Shoppers login will be displayed
When User enters "qa_testmarchantdell@gmail.com" and "password@123"
And click on login button
Then Shopper should be sucessfully logged in
And Browser must be close

Scenario: Validate Merchant can login using valid credentials
Given broswer will open and url navigated
And Login page will be displayed
And Shoppers login will be displayed
When User enters "qa_marchantlogin@gmail.com" and "password@123"
And click on login button
Then Shopper should be sucessfully logged in
And Browser must be close

Scenario: Validate Admin can login using valid credentials
Given broswer will open and url navigated
And Login page will be displayed
And Shoppers login will be displayed
When User enters "qa_testadmindell@gmail.com" and "password@123"
And click on login button
Then Shopper should be sucessfully logged in
And Browser must be close