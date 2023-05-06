package com.languageLine.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.languageLine.testCases.BaseClass;

public class SignUpPage extends BaseClass {

	WebDriver ldriver;
	public SignUpPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
	}
	

	String signUpButton = "//a[text()='Sign up']";
	String userNameTextBox = "//input[@id='sign-username']";
	String passwordTextBox = "//input[@id='sign-password']";
	

	

	public void clickOnSignUpButton() throws InterruptedException {
		wait.waitForElement(signUpButton, 5).click();
	}
	
	public void fillInUserNameTextbox(String username) throws InterruptedException {
		wait.waitForElement(userNameTextBox, 5).sendKeys(username);
	}
	
	public void fillInPasswordTextbox(String password) throws InterruptedException {
		wait.waitForElement(passwordTextBox, 5).sendKeys(password);
	}
	

	
	
}
