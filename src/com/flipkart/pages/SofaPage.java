package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import filpkart_project.BaseTestScript;

public class SofaPage extends CommanPage{
	
	@FindBy(xpath="//a[@pogid='641237641470']")
	private WebElement sofalink;
	
	
	@FindBy(id="pincode-check")
	private WebElement pincodeTextbox;
	
	@FindBy(xpath="//span[text()='check']")
	private WebElement pinCheckButton;
	
	@FindBy(id="add-cart-button-id")
	private WebElement addCardButton;
	
	
	
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
	
	public void clickOnAddCartButton()
	{
		addCardButton.click();
	}
	
	

}
