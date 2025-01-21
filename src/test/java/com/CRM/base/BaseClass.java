package com.CRM.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;


public class BaseClass {

	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;

	@BeforeTest
	public  void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationplayground.com/crm/");  
		hp=new HomePage(driver);
		lp=new LoginPage(driver);

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);	
		driver.close();
		
	}

}
