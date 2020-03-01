package com.max_international.stepdefs;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homestepdef extends StepDefinitionInit{
	//static WebDriver driver;
	@Given("^User is in welcome page$")
	public void user_is_in_welcome_page() throws Throwable {
		homePo.title();
	}

	@Then("^Select language and location$")
	public void select_language_and_location() throws Throwable {

		homePo.clickOnlanAndCountry();

	}

	@Then("^click on member login button$")
	public void click_on_member_login_button() throws Throwable {

		homePo.clickOnMemberBtn();
	}
	@And("^Title of page is login$")
	public void title_of_page_is_login() throws Throwable {
		homePo.title2();
	}
	@Then("^check if the login button is disabled$")
    public void check_if_the_login_button_is_disabled() throws Throwable {
        homePo.isLoginBtnDisabled();
    }
	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		
		homePo.credentials();
	}

	@And("^click on login$")
	public void click_on_login() throws Throwable {
		homePo.loginBtn();

	}
	@Then("^enter the (.+) and (.+)$")
    public void enter_the_and(String username, String password) throws Throwable {
		 homePo.invalidCredentials(username,password);
    }
	@And("^Error message appears $")
    public void error_message_appears() throws Throwable {
        Assertequals(expected_msg,homePo.iserrorMsgAppear());
    }

	  
	    }




