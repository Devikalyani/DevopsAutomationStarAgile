package com.CRM.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CRM.base.BaseClass;

public class LoginPageTest extends BaseClass{
	
	@BeforeClass
	public void pageSetup() {
		hp.getSignInLink();
	}
	
  @Test
  public void validateLogin() {
	  
	  String url=lp.doLogin("test@gmail.com", "test123");
	  Assert.assertTrue(url.contains("customer"),"Test case Fail: Login Fail");
	  System.out.println("Test case Pass: Login Successful");
  }
}
