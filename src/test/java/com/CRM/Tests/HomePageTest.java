package com.CRM.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.base.BaseClass;


public class HomePageTest extends BaseClass{
	
  @Test(priority=1)
  public void verifyAppURL() {
	 
	  String url=hp.getAppURL();
	  Assert.assertTrue(url.contains("crm"), "Test case Fail: both urls are mismatched");
	  System.out.println("Test case Pass: both urls are matched");
  }
  
  @Test(priority=2)
  public void verifyAppTitle() {
	  String title=hp.getPageTitle();
	  Assert.assertEquals(title, "Customer Service","Test case Fail: titles are mismatched");
	  System.out.println("Test case Pass: titles are matched");
  }
  
  @Test(priority=3)
  public void validateSignInLink() {
	  String singInUrl=hp.getSignInLink();
	  Assert.assertTrue(singInUrl.contains(""),"Test case Fail: Login Page not opened");
	  System.out.println("Test case Pass: App navigated to Login Page");
  }
}
