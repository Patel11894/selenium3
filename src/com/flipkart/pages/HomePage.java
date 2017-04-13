package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import filpkart_project.BaseTestScript;


public class HomePage extends CommanPage {
	
	
	@FindBy(id="inputValEnter")
	private WebElement searchTextbox;
	
	@FindBy(className="searchformButton")
	private WebElement searchButton;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTestScript.driver, this);
	}
	
	public void entersearchdata(String se)
	{
		searchTextbox.sendKeys(se);
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}

}
