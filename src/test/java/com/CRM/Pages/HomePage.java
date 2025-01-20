package com.CRM.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {


	/*POM - Page Object Model
	encapsulation -private data + public method */

	 private WebDriver driver;
	//initialize the driver
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//data member(locator)
	
	@FindBy(linkText="Sign In")
	WebElement loginLink;


	//method(functionality to test)
	@Test
	public String getAppURL() {
		return driver.getCurrentUrl();

	}
	
	@Test
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	@Test
	public String getSignInLink() {
		loginLink.click();
		return driver.getCurrentUrl();
	}
}
