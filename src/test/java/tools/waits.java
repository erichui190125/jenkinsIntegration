package tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.languageLine.testCases.BaseClass;

import junit.framework.Assert;

public class waits extends BaseClass {
	
	public WebElement waitForElement (String xpath, int seconds) throws InterruptedException {
		
		
		for(int i = 0; i < seconds; i++) {
			
			try {
				WebElement foundelement = driver.findElement(By.xpath(xpath));
				return foundelement;
				}
				catch(Exception e) {
				  Thread.sleep(1000);
				  logger.info("element not found");
				}
			
			
		}
		Assert.fail();
		return driver.findElement(By.xpath(xpath));
	
	}
	
	public List<WebElement> waitForElements (String xpath, int seconds) throws InterruptedException {
		
		
		for(int i = 0; i < seconds; i++) {
			
			try {
				List<WebElement> foundelements = driver.findElements(By.xpath(xpath));
				return foundelements;
				}
				catch(Exception e) {
				  Thread.sleep(1000);
				  logger.info("elements not found");
				}
			
			
		}
		Assert.fail();
		return driver.findElements(By.xpath(xpath));
	
	}
	public List<WebElement> waitForElementsCssSelector (String CSS, int seconds) throws InterruptedException {
		
		
		for(int i = 0; i < seconds; i++) {
			
			try {
				List<WebElement> foundelements = driver.findElements(By.cssSelector(CSS));
				return foundelements;
				}
				catch(Exception e) {
				  Thread.sleep(1000);
				  logger.info("elements not found");
				}
			
			
		}
		Assert.fail();
		return driver.findElements(By.cssSelector(CSS));
	
	}
	
}
