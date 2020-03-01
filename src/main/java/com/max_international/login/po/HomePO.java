package com.max_international.login.po;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;

public class HomePO extends MobileWebViewPage{
	
	WebDriverWait wait = new WebDriverWait(session.driver, 50);

	public HomePO(TestSession session) throws Exception {
		
		super(session, "Applications/Max_International/home");

}
public void title() {
	String login_title= session.driver.getTitle();
	System.out.println(login_title);
}

public void clickOnlanAndCountry() {
	System.out.println("Inside home page");
	element("english").click();
	element("countries").click();
	
}
public void clickOnMemberBtn() {
	element("memberlogin").click();
}
public void title2() {
	String home_title= session.driver.getTitle();
	System.out.println(home_title);
}
public boolean isLoginBtnDisabled() {
	
	boolean loginbtn = element("loginbtn").isEnabled();
	return loginbtn;
	
}
public void credentials() {
	element("myusername").sendKeys("fakejeff");
	element("mypassword").click();
	element("mypassword").sendKeys("f00b@r");
 }
	
public void loginBtn() {
	element("loginbtn").click();
}
public void invalidCredentials(String username, String password) {
	element("myusername").sendKeys(username);
	element("mypassword").click();
	element("mypassword").sendKeys(password);
}
public void iserrorMsgAppear() {
	String actual_message = element("errormsg").getText();
    String expected_msg = "Please enter valid username and password";
	System.out.println(actual_message);
}

}