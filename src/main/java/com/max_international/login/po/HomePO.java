package com.max_international.login.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;

public class HomePO extends MobileWebViewPage{
	
	WebDriverWait wait = new WebDriverWait(session.driver, 50);

	public HomePO(TestSession session) throws Exception {
		
		super(session, "Applications/Max_International/home");

}
public void homePageTitle() {
	String login_title= session.driver.getTitle();
	System.out.println(login_title);
}

public void clickOnLangAndCountry() {
	System.out.println("Inside home page");
	element("english").click();
	
	WebDriverWait wait= new WebDriverWait(session.driver,90);
	
	WebElement country= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Canada']")));
	
	//element("countries").click();
	country.click();
	
	
}
public void clickOnMemberBtn() {
	element("memberlogin").click();
}
public void loginPageTitle() {
	String home_title= session.driver.getTitle();
	System.out.println(home_title);
}
public boolean isLoginBtnDisabled() {
	
	boolean loginbtn = element("loginbtn").isEnabled();
	return loginbtn;
	
}
public void validCredentials() {
	element("myusername").sendKeys("fakejeff");
	element("mypassword").click();
	element("mypassword").sendKeys("f00b@r");
 }
	
public void clickOnLoginBtn() {
	element("loginbtn").click();
}
public void invalidCredentials(String username, String password) {
	element("myusername").sendKeys(username);
	element("mypassword").click();
	element("mypassword").sendKeys(password);
}
public void isErrorMsgAppear() {
	String actual_message = element("errormsg").getText();
    String expected_msg = "Please enter valid username and password";
	System.out.println(actual_message);
}

}