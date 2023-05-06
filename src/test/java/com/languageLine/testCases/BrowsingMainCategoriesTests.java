package com.languageLine.testCases;

import org.testng.annotations.Test;

import com.languageLine.pageObjects.HomePage;
import com.languageLine.pageObjects.SignUpPage;


import junit.framework.Assert;
import tools.waits;

public class BrowsingMainCategoriesTests extends BaseClass {
	

	//HomePage hp = new HomePage(driver);

	
	@Test (enabled=true) 
	public void clickPhonesTab() throws InterruptedException 
	{
		hp.clickOnPhonesTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("phones");
	}
	
	@Test (enabled=true) 
	public void clickLaptopsTab() throws InterruptedException 
	{
		hp.clickOnLaptopsTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("laptops");
	}
	
	@Test (enabled=true) 
	public void clickMonitorsTab() throws InterruptedException 
	{
		hp.clickOnMonitorsTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("monitors");
	}
	
	
	@Test (enabled=true) 
	public void verifyPhoneCatalogIsCorrect() throws InterruptedException 
	{
		hp.clickOnPhonesTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("phones");
	}
	
	@Test (enabled=true) 
	public void verifyLaptopsCatalogIsCorrect() throws InterruptedException 
	{
		hp.clickOnLaptopsTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("laptops");
	}
	
	@Test (enabled=true) 
	public void verifyMonitorsCatalogIsCorrect() throws InterruptedException 
	{
		hp.clickOnMonitorsTab();
		Thread.sleep(2000);
		//Passable arguments: "phones", "laptops", "monitors"
		hp.verifyAllCatalogItemsAndPrices("monitors");
	}
	
}
