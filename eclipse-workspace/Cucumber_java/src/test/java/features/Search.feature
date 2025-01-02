Feature: Search 
Scenario Outline: Validate when user enters text field then the search result must be displayed

Given Welcome page is diaplyed
When user enters "<Search text>" in search text field
Then Search results result must be diaplyed

Examples:
   |Search text|
   |Computer   |
   |Books      |
   |Electronics|