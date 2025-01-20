package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	private WebDriver driver;
	
	//initialize the driver
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(id="email-id")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit-id")
	WebElement submitBtn;
  @Test
  public String doLogin(String un,String pwd) {
	  userName.sendKeys(un);
	  password.sendKeys(pwd);
	  submitBtn.click();
	  return driver.getCurrentUrl();
  }
}
