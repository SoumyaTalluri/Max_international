package com.max_international.stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



public class Productstepdef extends StepDefinitionInit {
	
	

	    @When("^I click on the Products tab$")
	    public void i_click_on_the_products_tab() throws Throwable {
	    	productPO.clickOnProduct(); 
	    }
        @Then("^Title of the page is Product$")
	    public void title_of_the_page_is_product() throws Throwable {
	    	Assert.assertTrue(productPO.isProductPageAppear());
        }
        
		@Then("^I scroll the page down to the NUTRITIONALS$")
        public void i_scroll_the_page_down_to_the_nutritionals() throws Throwable {
        	productPO.scrollPageToNutritionals();
        }

        @Then("^I click on the Learn More$")
        public void i_click_on_the_learn_more() throws Throwable {
            productPO.clickOnLearnMore();
        }

        @And("^I observe the page open$")
        public void i_observe_the_page_open() throws Throwable {
            Assert.assertTrue(productPO.pageFullyLoaded());
        }
        @Then("^I Scroll the page down towards the bottom of the page$")
        public void i_scroll_the_page_down_towards_the_bottom_of_the_page() throws Throwable {
            productPO.scrollDownTheProductPage();
        }

        @Then("^I Hover over the (.+)$")
        public void i_hover_over_the(String image) throws Throwable {
        	 productPO.hoverOnSelectedImage(image);
        }
        @Then("^I Observe the image of the (.+)$")
        public void i_observe_the_image_of_the(String image) throws Throwable {
        	Assert.assertTrue(productPO.isImageHighlighted(image));
        }
     
       @Then("^I click on the \"([^\"]*)\" page$")
       public void i_click_on_the_something_page(String strArg1) throws Throwable {
    	   productPO.isSelectedPageOpened(strArg1);
       }

       @And("^I observe the \"([^\"]*)\" page open$")
       public void i_observe_the_something_page_open(String strArg2) throws Throwable {
         Assert.assertTrue(productPO.isSelectedPageLoaded(strArg2));
        }


        @Then("^I Hover on product$")
        public void i_hover_on_product() throws Throwable {
            productPO.hoverOnProduct();
        }

        @Then("^I click on the weight management$")
        public void i_click_on_the_weight_management() throws Throwable {
            productPO.clickOnWeightManagement();
        }

        @Then("^I observe page open$")
        public void i_observe_page_open() throws Throwable {
        	productPO.weightManagementPageOpen();
        }

        @Then("^I click on the product and then scroll down the page to the title \"([^\"]*)\"$")
        public void i_click_on_the_product_and_then_scroll_down_the_page_to_the_title_something(String strArg1) throws Throwable {
            productPO.scrollPageToMetaSwitch();
        }

        @And("^I check the page loaded$")
        public void i_check_the_page_loaded() throws Throwable {
           productPO.metaSwitchPageOpen();
        }
        @Then("^I select the \"([^\"]*)\" language from dropdown$")
        public void i_select_the_something_language_from_dropdown(String strArg1) throws Throwable {
            productPO.selectLanguageFromDropDwn(strArg1);
        }

        @And("^I Observe the product page banner in \"([^\"]*)\"$")
        public void i_observe_the_product_page_banner_in_something(String strArg1) throws Throwable {
            Assert.assertTrue(productPO.observeProductBanner(strArg1));
        }
       
        @Then("^I select \"([^\"]*)\" from country dropdown$")
        public void i_select_something_from_country_dropdown(String strArg1) throws Throwable {
        	productPO.selectLanguageFromDropDwn(strArg1);
        }


        @Then("^I click on Foundation$")
        public void i_click_on_foundation() throws Throwable {
           productPO.clickOnFoundationPage();
        }

        @Then("^I scroll down the foundation page$")
        public void i_scroll_down_the_foundation_page() throws Throwable {
            productPO.scrollDownFoundationPage();
        }

        @Then("^I click on buy now button$")
        public void i_click_on_buy_now_button() throws Throwable {
            productPO.clickOnBuyNowBtn();
        }
        @Then("^I observe the respective page open$")
        public void i_observe_the_respective_page_open() throws Throwable {
           
        }
        @Then("^I Click on Nutritionals$")
        public void i_click_on_nutritionals() throws Throwable {
            productPO.clickOnNutritionals();
        }

        @Then("^I scroll down the Nutritionals page$")
        public void i_scroll_down_the_nutritionals_page() throws Throwable {
            productPO.scrollDownNutritionalPage();
        }

        @Then("^I click on \"([^\"]*)\"$")
        public void i_click_on_something(String strArg1) throws Throwable {
            productPO.clickOnSelectedOption(strArg1);
        }

        @Then("^I observe Cellgevity page open$")
       public void i_observe_cellgevity_page_open() throws Throwable {
            Assert.assertTrue(productPO.observeThePageOpen("Max International - Cellgevity"));
        }
        @Then("^I observe MaxATP page open$")
        public void i_observe_maxatp_page_open() throws Throwable {
        	Assert.assertTrue(productPO.observeThePageOpen("Max International - MaxATP"));
        }
        @Then("^I observe Max N-Fuze page open$")
        public void i_observe_max_nfuze_page_open() throws Throwable {
        	Assert.assertTrue(productPO.observeThePageOpen("Max International - Max-NFuze"));
        }
        @Then("^I observe MaxONE page open$")
        public void i_observe_maxone_page_open() throws Throwable {
        	Assert.assertTrue(productPO.observeThePageOpen("Max International - MaxOne"));
        }
        @Then("^I observe MaxGXL page open$")
        public void i_observe_maxgxl_page_open() throws Throwable {
        	Assert.assertTrue(productPO.observeThePageOpen("Max International - MaxGXL"));
        }
        @Then("^I observe Max357 page open$")
        public void i_observe_max357_page_open() throws Throwable {
        	Assert.assertTrue(productPO.observeThePageOpen("Max International - Max357"));
        }
        @Then("^I scroll down the cellgevity page$")
        public void i_scroll_down_the_cellgevity_page() throws Throwable {
            productPO.scrollDowntheCellgivitypage();
        }
        @Then("^I click on add of any item$")
        public void i_click_on_add_of_any_item() throws Throwable {
           productPO.clickOnAdd();
        }

        @Then("^I click on sub of any item$")
        public void i_click_on_sub_of_any_item() throws Throwable {
           productPO.clickOnSubtract();
        }


        @Then("^I observe the result$")
        public void i_observe_the_result() throws Throwable {
            
        }

}

        
