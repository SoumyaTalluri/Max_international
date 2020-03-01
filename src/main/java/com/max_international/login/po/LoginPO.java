
package com.max_international.login.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;


/**
 * 
 * @author Nimit Jain
 *
 */

public class LoginPO extends MobileWebViewPage {

	WebDriverWait wait = new WebDriverWait(session.driver, 50);

	public LoginPO(TestSession session) throws Exception {
		super(session, "Applications/Max_International/login");
	}
	
	
	public void checkSite() {
		
		System.out.println("I am on the sign page.");
		//element("");
	}
}	
 
