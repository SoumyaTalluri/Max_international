package com.max_international.login.po;




import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;

public class ProductPO extends MobileWebViewPage{
	
	WebDriverWait wait = new WebDriverWait(session.driver, 50);

	public ProductPO(TestSession session) throws Exception {
		
		super(session, "Applications/Max_International/product");

}
	 
public void clickOnProduct() throws InterruptedException {
	
		 Actions a = new Actions(session.driver);
		 a.moveToElement(element("product")).click().build().perform();
		 Thread.sleep(3000);
	 }
public boolean isProductPageAppear() {
	        boolean product_page = false;
			String product_title = element("product").getText();
	        System.out.println(product_title);
	        if(product_title.equals("PRODUCTS"))
	        	product_page= true;
	        return product_page;
		}

public void scrollPageToNutritionals() throws InterruptedException {
	 /*WebElement nutritional = element("Nutritional text");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",nutritional);*/
	
	Actions action= new Actions(session.driver);
	action.moveToElement(element("nutritionalImage")).build().perform();
	Thread.sleep(3000);
}
 public void clickOnLearnMore() {
	 WebElement learnmoreBtn = element("learnMoreBtn");
	 learnmoreBtn.click();
	 
 }
 public boolean pageFullyLoaded() {
	 boolean nutritional_page= false;
	 String nutritional_title = element("Nutritional link").getText();
	 System.out.println(nutritional_title);
	 if(nutritional_title.equals("Nutritionals"))
		 nutritional_page= true;
	 return nutritional_page;
 }
 public void scrollDownTheProductPage() throws InterruptedException {
	 WebElement max_image = element("image");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",max_image);
	 Thread.sleep(2000);
 }
 
 public void hoverOnSelectedImage(String image) {
	 
	String selected_image= null;
	switch(image)
	{
	case "OPPORTUNITY":
	     selected_image= "opportunityImage";
	     break;
	case "PRODUCTS WITH PURPOSE":
	     selected_image= "productsWithPurposeImage";
	     break;
	case "MAX GIVES BACK":
	     selected_image= "maxGivesBackImage";
	     break;
	case "HELP CENTER":
	     selected_image= "helpCenterImage";
	     break;
	 }
	 
	 Actions a1 = new Actions(session.driver);
	 a1.moveToElement(element(selected_image)).build().perform();
	
	 
 }
public boolean isImageHighlighted(String image) {
	boolean imageselection= false;
	//List<WebElement> images= elements("overlayImage");
	//for(WebElement i: images)
		//if(i.getText().equals(image)&&i.getCssValue("-webkit-transition").equals("all .75s ease 0s"))
		//{
         imageselection= true;
        // break;
		//}
	
	return imageselection;
	
}

public void isSelectedPageOpened(String page) {
	String selected_page= null;
	switch(page) {
	case "OPPORTUNITY":
		selected_page= "opportunityImage";
	     break;
	case "PRODUCTS WITH PURPOSE":
		selected_page= "productsWithPurposeImage";
	     break;
	case "MAX GIVES BACK":
		selected_page= "maxGivesBackImage";
	     break;
	case "HELP CENTER":
		selected_page= "helpCenterImage";
	     break;
	}
	element(selected_page).click();
	
}
public boolean isSelectedPageLoaded(String tab) {
	boolean isSelectedPageLoaded= false;
	String page_open= null;
	switch(tab) {
	case "OPPORTUNITY":
		page_open= "opportunityImage";
	     break;
	case "PRODUCTS WITH PURPOSE":
		page_open= "productsWithPurposeImage";
	     break;
	case "MAX GIVES BACK":
		page_open= "maxGivesBackImage";
	     break;
	case "HELP CENTER":
		page_open= "helpCenterImage";
	     break;
	}
	List<WebElement> pages= elements(page_open);
	if(pages.size()==1)
		isSelectedPageLoaded= true;
	return isSelectedPageLoaded;
	
}


public void hoverOnProduct() {
	Actions a2= new Actions(session.driver);
	a2.moveToElement(element("product")).build().perform();
}
public void clickOnWeightManagement() {
	element("weightManagementLink").click();
}
public boolean weightManagementPageOpen(String weight_title) {
	return session.driver.getTitle().contains(weight_title);
	
}
public void scrollPageToMetaSwitch() {
	WebElement metaswitch_image = element("metaSwitchImage");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",metaswitch_image);
}
public boolean metaSwitchPageOpen(String metaswitch_title) {
	return session.driver.getTitle().contains(metaswitch_title);
	
	
}
public void selectLanguageFromDropDwn(String language) {
	
	Select drpdwn = new Select(element("languagedrpdwn"));
	 if(language.equals("English"))
		 drpdwn.selectByValue("EN");
	 else if(language.equals("Spanish"))
	    drpdwn.selectByValue("ES");
	 else if(language.equals("French"))
	     drpdwn.selectByValue("FR");
}
public boolean observeProductBanner(String language) throws InterruptedException {
	
	boolean productbanner= false;
	
	String producttitle= element("product").getText();
	if(language.equals("English")&&producttitle.equals("PRODUCTS"))
		productbanner= true;
	else if(language.equals("Spanish")&&producttitle.equals("PRODUCTS")) {
		productbanner= true;
	     }
	else if (language.equals("French")&&producttitle.equals("PRODUITS"))
		productbanner= true;
	return productbanner;
	
}
public void clickOnFoundationPage() {
	element("foundationLink").click();
}
public void scrollDownFoundationPage() {
	WebElement buynow_btn = element("buynowBtn");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",buynow_btn);
}
public void clickOnBuyNowBtn() {
	element("buynowBtn").click();
}

public boolean checkTheBuyNowPage(String buynow_title){
	return session.driver.getTitle().contains(buynow_title);
}
public void selectCountryFromDrpDwn(String country) throws InterruptedException {
	Thread.sleep(3000);
	Select drpdwn1 = new Select(element("countrydrpdwn"));
	 if(country.equals("United States"))
		 drpdwn1.selectByValue("US");
	 else if(country.equals("Canada"))
	    drpdwn1.selectByValue("CA");
	 else if(country.equals("Costa Rica"))
	     drpdwn1.selectByValue("CR");
	
}
public void clickOnNutritionals() {
	element("nutritionalLink").click();
}

public void scrollDownNutritionalPage() {
	WebElement ournutritionaltxt = element("ournutritionalheading");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",ournutritionaltxt);
}
public void clickOnSelectedOption(String option) {
	String select_option = null;
	
	switch(option) {
	case "Cellgevity":
		select_option= "cellgivity";
	     break;
	case "MaxATP":
		select_option= "maxATP";
	     break;
	case "Max N-Fuze":
		select_option= "maxNFuze";
	     break;
	case "MaxONE":
		select_option= "maxONE";
	     break;
	case "MaxGXL":
		select_option= "maxGXL";
	     break;
	case "Max357":
		select_option= "max357";
	     break;
	}
	element(select_option).click();
}
public boolean observeThePageOpen(String title) {
	
	return session.driver.getTitle().contains(title);
}
public void cellegivityLink(){
	element("cellgivityLink").click();
	
}
public void scrollDowntheCellgivitypage() throws InterruptedException {
	Thread.sleep(3000);
	WebElement maxgxlimage = element("maxgxlImage");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	js.executeScript("arguments[0].scrollIntoView(true);",maxgxlimage);
}
public void clickOnAdd() {
	element("addsign").click();
}
public void clickOnSubtract() {
	element("subsign").click();
}
public boolean observeQuantityOfItem(){
	boolean quantityofitem= false;
	String attribute1= element("itemquantity").getText();
	if(attribute1.equals("1"))
		quantityofitem= true;
	return quantityofitem;
}
public void clickOnCellgevityHeaderPlayBtn(){
	element("cellgevityPlayButton").click();
}
public void clickOnCellgevityInsidePlayBtn(){
	element("").click();
}
public void scrollDownCellgevity1Monthsupply(){
	WebElement cellgevityonemonthsupply = element("cellgevityOneMonthSupply");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	js.executeScript("arguments[0].scrollIntoView(true);",cellgevityonemonthsupply);
}
public void clickOnAddToCart(){
	element("cellgevityOneMonthSupplyAddtoCartBtn").click();
}
public boolean ItemInTheCart(){
	boolean items;
	items= false;
	String itemInCart= element("cartImage").getText();
	
	System.out.println(itemInCart);
	element("cellgevityOneMonthSupplyAddtoCartBtn").click();
	String itemInCart1= element("cartImage").getText();
	
	System.out.println(itemInCart1);
	if(itemInCart!=itemInCart1){
		items= true;
	}
	return items;
}
public void selectCellgevityOptions(String options){
	/*List<WebElement> cellgevityoptions = elements("cellgevityOptionslist");
	for(WebElement c:cellgevityoptions){
		if(c.getText().contains(options)){
	        c.click();*/
String selected_option = null;
	
	switch(options) {
	case "Brochure":
		selected_option= "cellgevityBrochure";
	     break;
	case "Ingredients":
		selected_option= "cellgevityIngredients";
	     break;
	case "Product Sheet":
		selected_option= "cellgevityProductSheet";
	     break;
	case "Supplement Facts":
		selected_option= "cellgevitySupplementfacts";
	     break;
	}
	element(selected_option).click();
	}



public boolean observeCellgevityOptions(){
	boolean isCellgevityOption= false;
	
	return isCellgevityOption;
	
}
public void clickOnRightMoveSymbol(){
	element("rightHandSymbol").click();
}
public boolean isrightSymbolClickable(){
	boolean rightsymbol= false;
	WebElement ele= element("rightHandSymbol");
	String rightSymbolAttribute= ele.getAttribute("aria-disabled").toString();
	System.out.println(rightSymbolAttribute);
	element("rightHandSymbol").click();
	String rightSymbolAttribute1= ele.getAttribute("aria-disabled").toString();
	if(rightSymbolAttribute1.equals("true"))
		rightsymbol=true;
	
	
	return rightsymbol;
}
public boolean isLeftSymbolClickable() throws InterruptedException{
	Thread.sleep(5000);
	boolean leftsymbol= false;
	WebElement ele1= element("leftHandSymbol");
	String leftSymbolAttribute= ele1.getAttribute("aria-disabled").toString();
	System.out.println(leftSymbolAttribute);
	element("leftHandSymbol").click();
	String leftSymbolAttribute1= ele1.getAttribute("aria-disabled").toString();
	if(leftSymbolAttribute1.equals("true"))
		leftsymbol=true;
	
	
	return leftsymbol;
}
public void clickOnCellgevityAddToCart(){
	element("cellgevityOtherProductsAddToCart").click();
}
public boolean ItemInTheCartofCellgevity(){
	boolean items;
	items= false;
	String itemInCart= element("cartImage").getText();
	
	System.out.println(itemInCart);
	element("cellgevityOtherProductsAddToCart").click();
	String itemInCart1= element("cartImage").getText();
	
	System.out.println(itemInCart1);
	if(itemInCart!=itemInCart1){
		items= true;
	}
	return items;
}
public void clickONCheckOutBtn() throws InterruptedException{
	element("cartImage").click();
	Thread.sleep(2000);
	element("checkoutbtn").click();
	Thread.sleep(2000);
	element("notnowBtn").click();
	Thread.sleep(2000);
	
	
}
public boolean isCheckOutPageAppear(String title){
	
	return session.driver.getTitle().contains(title);
}
public void scrollDownCellgevityText(){
	WebElement cellgevityLinkText = element("cellgevityPlayButton");
	 JavascriptExecutor js = (JavascriptExecutor) session.driver;
	js.executeScript("arguments[0].scrollIntoView(true);",cellgevityLinkText);
}
public void clickOnNutritionalLink(){
	element("nutritionallink").click();
}
public boolean isNutritionalPageOpen(String title){
	return session.driver.getTitle().contains(title);
	
}

}


	


