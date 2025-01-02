Feature: BusTickets

Background:
Given Browser will be lunched and url should be navigated
And user click on bus ticket button
@smoke
Scenario Outline: validate user should able to get data in relavent language
When user is able to click on  <language> in the language dropdown
Then user should able to see the information in relavent language


Examples:
|language|
|1|
|2|
|3|


@smoke
Scenario: Validate user is able to see the relavent bus offers
When user should  click on ViewAll link
And user should navigate to Offer page
Then user should get bus Offers
And user should come back from bus offers

@smoke
Scenario: Validate that the user is able to navigate to the head office of punjab 
When user  click on government buses viewAll
And user should navigate to the find all the RTC Operator directories page
And user  able to click on north zone PEPSU bus link
Then user should able to navigate to that paticular page 
And user click on head office of punjab 
And user should navigate

@smoke
Scenario: Validate user is able to know about Refund related Cancellation related ticket related
When user  click on FAQ 
And user should navigate to the frequent asked Questions
And user click on ticket related
And user click on  refund related
And user click on cancellation related
Then user click on terms and conditions
And user should navigate to the page
Then user click on userAgrement 
And user should navigate to the relavent page


@smoke
Scenario: Validate that the user is  able to see main bus route in colombia
When user click on Colombia 
And colombia page should be displayed
When user click on main bus route in colombia
And user should get the relavent information
And user click on peru
And user should navigate to the peru page
And user click on Readmore in peru
Then user click on Singapore
And user should navigate to the singapore page
  
