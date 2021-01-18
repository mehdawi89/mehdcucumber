Feature: Search and place order for vegetables 

Scenario: Search for Items and validate results 

Given user is on Greencart landing page
When User search for "Cucumber" Vegetable
Then "Cucumber" Results are displayed

Scenario: Search for Items and proceed to checkout

Given user is on Greencart landing page
When User search for "Brinjal" Vegetable
And Add items to cart
And User process to checkout page
