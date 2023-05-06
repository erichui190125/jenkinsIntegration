package com.languageLine.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

import junit.framework.Assert;

public class ProductPage extends BaseClass {
	WebDriver ldriver;
	public ProductPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	String addToCartButton = "//a[text()='Add to cart']";
	String itemPriceText = "//h3[@class='price-container']";
	


	

	
	public void clickOnAddToCartButton() throws InterruptedException {
		wait.waitForElement(addToCartButton, 5).click();
	}
	
	public void closeProductAddedPopup() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); alert.accept();
	}
	
	public void verifyProductAddedPopupText() throws InterruptedException {
		String productAddedText = driver.switchTo().alert().getText();
		Assert.assertEquals(productAddedText, "Product added");
	}
	
	public String returnPriceOfItemProductPage() throws InterruptedException {
		String price = wait.waitForElement(itemPriceText, 3).getText().substring(1);
		int spaceIndex = price.indexOf(" ");
		String outputString = price.substring(0, spaceIndex);
		return outputString;
		
	}
	

}
