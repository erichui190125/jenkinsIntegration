package com.languageLine.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

public class ContactPage extends BaseClass {

	WebDriver ldriver;
	public ContactPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	
	String element_A_ValueReplace = "//a[contains(text(),'Value')]";
	
	@FindBy(xpath="//a[contains(text(),'Client Resources')]")
	@CacheLookup
	WebElement clientResourcesHeaderTab;
	
	@FindBy(xpath="//a[contains(text(),'Voice of the Customer')]")
	@CacheLookup
	WebElement clientResourcesVoiceOfTheCustomer;
	

	
	public void hoverOverClientResourcesHeaderTabThenClickTabName(String tabName) throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(clientResourcesHeaderTab).moveToElement(ldriver.findElement(By.xpath(element_A_ValueReplace.replace("Value", tabName)))).click().perform();
	}
	
}
