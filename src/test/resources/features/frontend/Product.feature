Feature: Max international Product screen
@p1
Scenario: [product_01] To verify that all the elements of the product page load properly
Given I am in welcome page 
When I select language and location
When I click on the Products tab
Then Title of the page is Product 
@p2
Scenario: [product_02] To verify that user is able to redirect to the "Nutritionals" page
When I click on the Products tab
When I scroll the page down to the NUTRITIONALS
When I click on the Learn More

@p3
Scenario: [product_03] To verify that all the elements of the "Nutritionals" page load properly
And I observe the page open

@p4
Scenario Outline: [product_04] To verify that the hovered image should be highlighted properly
When I Scroll the page down towards the bottom of the page
When I Hover over the <Image>
Then I Observe the image of the <Image>

Examples: 
|Image|
|OPPORTUNITY|
|PRODUCTS WITH PURPOSE|
|MAX GIVES BACK|
|HELP CENTER|


@p5
Scenario: [product_05] To verify that user is able to redirect to the "OPPORTUNITY" page
When I click on the "OPPORTUNITY" page
And I observe the "OPPORTUNITY" page open
When I Scroll the page down towards the bottom of the page

@p6
Scenario: [product_06] To verify that user is able to redirect to the "PRODUCTS WITH PURPOSE" page
When I click on the "PRODUCTS WITH PURPOSE" page
And I observe the "PRODUCTS WITH PURPOSE" page open
When I Scroll the page down towards the bottom of the page
@p7
Scenario: [product_07] To verify that user is able to redirect to the "MAX GIVES BACK" page
When I click on the "MAX GIVES BACK" page
And I observe the "MAX GIVES BACK" page open
When I Scroll the page down towards the bottom of the page
@p8
Scenario: [product_08] To verify that user is able to redirect to the "HELP CENTER" page
When I click on the "HELP CENTER" page
And I observe the "HELP CENTER" page open
@p9
Scenario: [product_09] To verify that the products title should localized according to the language selected
When I click on the Products tab
When I select the "English" language from dropdown
And I Observe the product page banner in "English"
When I select the "Spanish" language from dropdown
And I Observe the product page banner in "Spanish"
When I select the "French" language from dropdown
And I Observe the product page banner in "French"



@p10
Scenario: [product_10] To verify that the user will redirected to the switch page when clicks on the switch learn more option from the products page
When I click on the Products tab
When I Hover on product
When I click on the weight management
Then I observe page open
When I click on the product and then scroll down the page to the title "the meta switch weight management system"
And I check the page loaded
@p11
Scenario: [product_11] To verify the user will get redirected to the appropriate page when the user clicks on the buy now button of the product listed under beauty page
When I click on the Products tab
When I Hover on product
When I click on Foundation
When I scroll down the foundation page
When I click on buy now button
Then I observe the respective page open

#Nutritionals
@n1
Scenario: To verify that user is able to redirect to "Cellgevity"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "Cellgevity"
Then I observe Cellgevity page open
@n2
Scenario: To verify that user is able to redirect to "MaxATP"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "MaxATP"
Then I observe MaxATP page open
@n3
Scenario: To verify that user is able to redirect to "Max N-Fuze"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "Max N-Fuze"
Then I observe Max N-Fuze page open
@n4
Scenario: To verify that user is able to redirect to "MaxONE"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "MaxONE"
Then I observe MaxONE page open
@n5
Scenario: To verify that user is able to redirect to "MaxGXL"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "MaxGXL"
Then I observe MaxGXL page open
@n6
Scenario: To verify that user is able to redirect to "Max357"
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page 
When I click on "Max357"
Then I observe Max357 page open
@n7
Scenario: To verify the user is able to decrease the item’s quantity when clicks on the ‘-’ button on all the nutritionals options
When I click on the Products tab
When I Hover on product
When I click on Cellgevity link
When I scroll down the cellgevity page
When I click on add of any item
When I click on sub of any item
Then I observe the result

Scenario: To verify that all the nutritonal category which appear inside the nutritionals page will also appear in the product header menu
When I click on the Products tab
When I Hover on product
When I Click on Nutritionals
When I scroll down the Nutritionals page
@c1
Scenario: To verify that user is able to play the header video
When I Hover on product
When I click on Cellgevity link
When I click on the play button of the header video
When I click on the play button inside
@c2
Scenario: To verify that user is able to add "Cellgevity 1 month supply" to the cart
When I Hover on product
When I click on Cellgevity link
When I scroll down till Cellgevity 1 month supply
When I click on add to cart button
@c3
Scenario: To verify that user is able to open "Cellgevity Brochure"
When I Hover on product
When I click on Cellgevity link
When I scroll down till Cellgevity 1 month supply
When I click on cellgevity "Brochure"
Then I observe the cellgevity "Brochure"
@c4
Scenario: To verify that user is able to open "Cellgevity Ingredients"
When I Hover on product
When I click on Cellgevity link
When I scroll down till Cellgevity 1 month supply
When I click on cellgevity "Ingredients"
Then I observe the cellgevity "Ingredients"
 
@c5
Scenario: To verify that user is able to open "Cellgevity Product Sheet"
When I Hover on product
When I click on Cellgevity link
When I scroll down till Cellgevity 1 month supply
When I click on cellgevity "Product Sheet"
Then I observe the cellgevity "Product Sheet"
@c6
Scenario: To verify that user is able to open "Cellgevity Supplement Facts"
When I Hover on product
When I click on Cellgevity link
When I scroll down till Cellgevity 1 month supply
When I click on cellgevity "Supplement Facts"
Then I observe the cellgevity "Supplement Facts"
@c7
Scenario: To verify that user can see all other Products on Cellgevity page
When I Hover on product
When I click on Cellgevity link
When I scroll down the cellgevity page
Then I click on > symbol
Then I click on the < symbol
@c8
Scenario: To verify that user is able to add "Other Products" to the cart 
When I Hover on product
When I click on Cellgevity link
When I scroll down the cellgevity page
When I click on add to cart button in cellgevity page
Then I check the cart for items
@c9
Scenario: To verify that user is able to CheckOut "Other Products" 
When I Hover on product
When I click on Cellgevity link
When I scroll down the cellgevity page
When I click on add to cart button in cellgevity page
Then I check the cart for items
When I click on checkout button
Then I observe the checkout page open
@c10
Scenario: To verify that user is abe to go to the "Nutritionals" page by using the link on the page
When I Hover on product
When I click on Cellgevity link
When I scroll down till cellgevity link appear
When I click on Nutritionals link
Then I observe the nutritionals page











