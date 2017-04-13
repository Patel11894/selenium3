package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import filpkart_project.BaseTestScript;

public class SofaPage {
	
	@FindBy(xpath="//a[@pogid='641237641470']")
	private WebElement sofalink;
	
	
	@FindBy(id="pincode-check")
	private WebElement pincodeTextbox;
	
	@FindBy(xpath="//span[text()='check']")
	private WebElement pinCheckButton;
	
	public SofaPage()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	
	public void clickOnSofaLink()
	{
		sofalink.click();
	}
	
	public void enterPincode(String pin)
	{
		pincodeTextbox.sendKeys(pin);
	}
	
	public void clickOnCheckPin()
	{
		pinCheckButton.click();
	}
	
	

}
