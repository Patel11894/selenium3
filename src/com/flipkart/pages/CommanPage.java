package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import filpkart_project.BaseTestScript;

public class CommanPage {
	
	
	@FindBy(className="cartInner")
	private WebElement basketButton;
	
	@FindBy(className="remove-item-shortlist")
	private WebElement removeFromCardButton;
	
	@FindBy(className="icon-font-grey-size24")
	private WebElement closeButton;
	
	@FindBy(linkText="Help Center")
	private WebElement helpCenterButton;
	
	
	public CommanPage()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	
	public void clickOnCardBasket()
	{
		basketButton.click();
	}
	
	public void clickOnRemoveFromcard()
	{
		removeFromCardButton.click();
	}
	
	public void clickOnPopupClose()
	{
		closeButton.click();
	}
	
	public WebElement clickOnHelpCenter()
	{
		return helpCenterButton;
	}

}
