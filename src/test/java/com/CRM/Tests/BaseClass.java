package com.CRM.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;


public class BaseClass {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;

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
	public void afterTest() {
		driver.close();
		
	}

}
