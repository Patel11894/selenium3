package filpkart_project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.pages.HomePage;
import com.flipkart.pages.SofaPage;



public class PurchaseFrige extends BaseTestScript 
{
	
	@Test
	public void purchase() throws InvalidFormatException, IOException, InterruptedException, AWTException
	{
	//	WebDriverWait wait = new WebDriverWait(BaseTestScript.driver, 20);
		String searchItem = Excel_Util.readData("userdata.xlsx", "SearchIteam", 1, 0);
		System.out.println(searchItem);
		double pincodeNum = Excel_Util.readNumericData("userdata.xlsx", "PincodeNum", 1, 0);
		System.out.println(pincodeNum);
		String pin = Double.toString(pincodeNum);
		HomePage hp = new HomePage();
	    SofaPage sp = new SofaPage();   
	    hp.entersearchdata(searchItem);
	    Reporter.log("Enter Search item", true);
	    hp.clickOnSearchButton();
	    Reporter.log("Clicking on Search button", true);
	    sp.clickOnSofaLink();
	    Reporter.log("Clicking on Sofa Link", true);
		ArrayList<String> tabs2 = new ArrayList<String> (BaseTestScript.driver.getWindowHandles());
	    BaseTestScript.driver.switchTo().window(tabs2.get(1));
	    sp.enterPincode(pin);
	    Reporter.log("Enetr Pin Number", true);
	    sp.clickOnCheckPin();
	    Reporter.log("Clicking on CheckPin Button", true);
	    Thread.sleep(5000);
	  //  wait.until(ExpectedConditions.elementToBeClickable(By.id("add-cart-button-id")));
	    sp.clickOnAddCartButton();
	    Reporter.log("Clicking on Add to Card Button", true);
	    sp.clickOnCardBasket();
	    Reporter.log("Clicking on the Basket", true);
	    sp.clickOnRemoveFromcard();
	    Reporter.log("Removing item from Card", true);
	    Thread.sleep(5000);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-font-grey-size24")));
	    sp.clickOnPopupClose();
	    Reporter.log("Close the Popup", true);
	    Thread.sleep(5000);    
	    Actions act = new Actions(driver);
	    
	    WebElement ele = sp.clickOnHelpCenter();
	    
	    act.moveToElement(ele).click().perform();
	    Reporter.log("Clicking on the Help Center Button", true);
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("About Us")).click();
	    Reporter.log("Clicking on the about us", true);
	    
		}


}
