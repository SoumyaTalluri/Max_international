Feature: Max international Product screen
Scenario: [product_01] To verify that all the elements of the product page load properly
Given I am in welcome page 
When I select language and location
When I click on the Products tab
Then Title of the page is Product 
When I scroll the page down to the NUTRITIONALS
When I click on the Learn More
And I observe the page open
When I Scroll the page down towards the bottom of the page
When I Hover over the "OPPORTUNITY"
Then I Observe the image of the "OPPORTUNITY"
When I Hover over the "PRODUCTS WITH PURPOSE"
Then I Observe the image of the "PRODUCTS WITH PURPOSE"
When I Hover over the "MAX GIVES BACK"
Then I Observe the image of the "MAX GIVES BACK"
When I Hover over the "HELP CENTER"
Then I Observe the image of the "HELP CENTER"
When I click on the "OPPORTUNITY" page
And I observe the "OPPORTUNITY" page open
When I Scroll the page down towards the bottom of the page
When I click on the "PRODUCTS WITH PURPOSE" page
And I observe the "PRODUCTS WITH PURPOSE" page open
When I Scroll the page down towards the bottom of the page
When I click on the "MAX GIVES BACK" page
And I observe the "MAX GIVES BACK" page open
When I Scroll the page down towards the bottom of the page
When I click on the "HELP CENTER" page
And I observe the "HELP CENTER" page open
When I click on the Products tab
When I select the "English" language from dropdown
And I Observe the product page banner in "English"
When I select the "Spanish" language from dropdown
And I Observe the product page banner in "Spanish"
When I select the "French" language from dropdown
And I Observe the product page banner in "French"

