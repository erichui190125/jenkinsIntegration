package com.languageLine.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class ShoppingCartTests extends BaseClass {

	@Test (enabled=true) 
	public void addingOneItemToTheShoppingCart() throws InterruptedException 
	{
		
		//Passable arguments: "phones", "laptops", "monitors"
		hp.clickOnPhonesTab();
		hp.clickOnFirstItem();
		pp.clickOnAddToCartButton();
		Thread.sleep(2000);
		pp.verifyProductAddedPopupText();
		pp.closeProductAddedPopup();
	}
	
	@Test (enabled=true) 
	public void addingTwoItemsToTheShoppingCart() throws InterruptedException 
	{
		addingOneItemToTheShoppingCart();
		//pp.closeProductAddedPopup();
		driver.get("https://www.demoblaze.com");
		addingOneItemToTheShoppingCart();
	}
	
	@Test (enabled=true) 
	public void deletingAnItemFromTheShoppingCart() throws InterruptedException 
	{
		addingTwoItemsToTheShoppingCart();
		System.out.println("Finished adding two items");
		//pp.closeProductAddedPopup();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(5000);
		hp.clickOnCartButton();
		System.out.println("finished click on cart");
		cp.clickDeleteButton();
		System.out.println("finished click delete");
		cp.verifyOnlyOneItemIsInCart();
		System.out.println("finished verifyonlyone item");
		
	}
	
	@Test (enabled=true) 
	public void clickThePlaceOrderButton() throws InterruptedException 
	{
		addingOneItemToTheShoppingCart();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(4000);
		hp.clickOnCartButton();
		cp.clickPlaceOrderButton();
		cp.verifyPlaceOrderPopupIsDisplayed();
	}
	
	@Test (enabled = true)
	public void checkTotalOfSingleItemInTheShoppingCart() throws InterruptedException {
		hp.clickOnFirstItem();
		String itemPrice = pp.returnPriceOfItemProductPage();
		pp.clickOnAddToCartButton();
		Thread.sleep(2000);
		pp.closeProductAddedPopup();
		driver.get("https://www.demoblaze.com");
		Thread.sleep(4000);
		hp.clickOnCartButton();
		cp.verifyTotalPriceTextMatchesPriceOfFirstItem(itemPrice);
	}
	

	

	
}
