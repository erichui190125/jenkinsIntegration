package com.languageLine.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

import junit.framework.Assert;

public class CartPage extends BaseClass{

	WebDriver ldriver;
	public CartPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	
	String deleteButton = "//a[text()='Delete']";
	String placeOrderButton = "//button[text()='Place Order']";
	String placeOrderPopUpTitle = "//h5[text()='Place order']";
	String placeOrder_NameTextBox = "//input[@id='name']";
	String placeOrder_PurchaseButton = "//button[text()='Purchase']";
	String placeOrder_CreditCardTextBox = "//input[@id='card']";
	String totalPriceText = "//h3[@id = 'totalp']";
	String thankYouForYourPurchaseText = "//h2[text()='Thank you for your purchase!']";

	

	public void clickDeleteButton() throws InterruptedException {
		wait.waitForElement(deleteButton, 3).click();
	}
	
	public void verifyOnlyOneItemIsInCart() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(1, wait.waitForElements(deleteButton, 5).size());
	}
	
	public void clickPlaceOrderButton() throws InterruptedException {
		wait.waitForElement(placeOrderButton,  5).click();
	}
	
	public void verifyPlaceOrderPopupIsDisplayed() throws InterruptedException {
		wait.waitForElement(placeOrderPopUpTitle, 4);
		Thread.sleep(2000);
		Assert.assertEquals("Place order", wait.waitForElement(placeOrderPopUpTitle, 4).getText());
		
	}
	//incomplete
	public void verifyTotalPriceTextMatchesPriceOfFirstItem(String itemPriceProductPage) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(itemPriceProductPage + " " + wait.waitForElement(totalPriceText, 5).getText());
		System.out.println("hi");
		Assert.assertEquals(itemPriceProductPage, wait.waitForElement(totalPriceText, 3).getText());
	}
	
	public void fillInNameFieldPlaceOrderPopUp (String name) throws InterruptedException {
		wait.waitForElement(placeOrder_NameTextBox, 5).sendKeys(name);
	}
	
	public void fillInCreditCardFieldPlaceOrderPopUp (String name) throws InterruptedException {
		wait.waitForElement(placeOrder_CreditCardTextBox, 5).sendKeys(name);
	}
	
	public void clickPurchaseButtonPlaceOrderPopup() throws InterruptedException {
		wait.waitForElement(placeOrder_PurchaseButton, 4).click();
	}
	
	public void verifyThankYouForYourPurchaseText() throws InterruptedException {
		Assert.assertEquals("Thank you for your purchase!", wait.waitForElement(thankYouForYourPurchaseText, 5).getText());
	}
	

	
	
}
