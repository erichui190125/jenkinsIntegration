package com.languageLine.pageObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;
import com.languageLine.testData.Catalog;

import junit.framework.Assert;

public class HomePage extends BaseClass {

	
	WebDriver ldriver;
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	
	String phonesTab = "//a[text()='Phones']";
	String laptopsTab = "//a[text()='Laptops']";
	String monitorsTab = "//a[text()='Monitors']";
	String allItemTitles = "//h4[@class='card-title']";
	String allItemPrices = "div.row h5";
	String cartButton = "//a[text()='Cart']";

	
	public void clickOnPhonesTab() throws InterruptedException {
		wait.waitForElement(phonesTab, 5).click();
	}
	
	public void clickOnLaptopsTab() throws InterruptedException {
		wait.waitForElement(laptopsTab, 5).click();
	}
	
	public void clickOnMonitorsTab() throws InterruptedException {
		wait.waitForElement(monitorsTab, 5).click();
	}
	
	public void clickOnFirstItem() throws InterruptedException {
		wait.waitForElement(allItemTitles, 5).click();
	}
	
	public void clickOnCartButton() throws InterruptedException {
		wait.waitForElement(cartButton, 5).click();
	}
	
	public void verifyAllCatalogItemsAndPrices(String itemCatalog) throws InterruptedException{
		Thread.sleep(3000);
		
		List<WebElement> itemTitles = wait.waitForElements(allItemTitles, 5);
		List<WebElement> itemPrices = wait.waitForElementsCssSelector(allItemPrices, 5);
		

		System.out.println("itemTitles and itemPrices lists are created");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		List<String> stringListItems = new ArrayList<String>();
		List<Integer> integerListPrices = new ArrayList<Integer>();
		//converting itemTitles to String List
		for (WebElement element : itemTitles) {
		    stringListItems.add(element.getText());
		}
		System.out.println("added contents of itemTitles into stringListItems");
		
		//converting itemPrices to Integer List
		for (WebElement element : itemPrices) {
		    integerListPrices.add(Integer.parseInt(element.getText().substring(1)));
		}
		//inserting new string list and integer list into hashmap
		for(int i=0; i<stringListItems.size(); i++) {
			map.put(stringListItems.get(i), integerListPrices.get(i));
		}
		
		System.out.println(map);
		Catalog catalog = new Catalog();
		Assert.assertEquals(map, catalog.allMaps().get(itemCatalog));
		System.out.println("asserted true");

		
	}
	
}
