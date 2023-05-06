package com.languageLine.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class CheckoutTests extends BaseClass {
	
	

	
	@Test(enabled = false)
	public void fillInAllRequiredFieldsAndPurchaseItems () throws InterruptedException {
		hp.clickOnFirstItem();
		pp.clickOnAddToCartButton();
		pp.closeProductAddedPopup();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(4000);
		hp.clickOnCartButton();
		cp.clickPlaceOrderButton();
		cp.fillInCreditCardFieldPlaceOrderPopUp("1234556");
		cp.fillInNameFieldPlaceOrderPopUp("thisisdemoname");
		cp.clickPurchaseButtonPlaceOrderPopup();
		cp.verifyThankYouForYourPurchaseText();
	
	}
	
	@Test(enabled = true)
	public void sonyDemo () throws InterruptedException {
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
		driver.findElement(By.xpath("(//a[@title = 'You are encouraged to create an account and log in; however, it is not mandatory'])[1]")).click();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver", driver.getCurrentUrl());
		driver.close();
		System.out.println("testing eclipse push");
	
	}

}
