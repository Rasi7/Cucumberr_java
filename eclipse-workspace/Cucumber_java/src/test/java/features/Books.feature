Feature: Books
Background:
Given brower is open and navigate to url
When user is logged
And user clicks on book page
And Book page is displayed


Scenario:Validate user can sort the page alphabetically
And User chooses A-Z in sort by drop down 
Then page should be sorted alphabetically


Scenario:Validate user can add Computing and Internet book to cart 
And user clicks on add to cart button for computing and internet book
Then book should be added to cart


Scenario:Validate user can add Health book to cart
And clicks on add to cart button for Health book
Then Book should be added to cart



