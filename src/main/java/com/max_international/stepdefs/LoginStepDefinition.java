package com.max_international.stepdefs;


import cucumber.api.java.en.Given;



public class LoginStepDefinition extends StepDefinitionInit {


	
    @Given("^I am on the sigin page$")
    public void i_am_on_the_sigin_page() throws Throwable {
    	
    	loginPO.checkSite();
    	
    }
     
	    
}
