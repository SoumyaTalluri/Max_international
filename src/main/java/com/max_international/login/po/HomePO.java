package com.max_international.login.po;

import org.openqa.selenium.support.ui.WebDriverWait;

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

public void homePage() {
	System.out.println("Inside home page");
	element("english").click();
	element("countries").click();
	
}
public void memberBtn() {
	element("memberlogin").click();
}
public void title2() {
	String home_title= session.driver.getTitle();
	System.out.println(home_title);
}
public void credentials() {
	element("username").sendKeys("fakejeff");
	element("password").click();
	element("password").sendKeys("f00b@r");
}
public void loginBtn() {
	element("loginbtn").click();
	
	
}

}