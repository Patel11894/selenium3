package filpkart_project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.flipkart.pages.HomePage;
import com.flipkart.pages.SofaPage;



public class PurchaseFrige extends BaseTestScript 
{
	
	@Test
	public void purchase() throws InvalidFormatException, IOException, InterruptedException, AWTException
	{
		
		String searchItem = Excel_Util.readData("userdata.xlsx", "SearchIteam", 1, 0);
		System.out.println(searchItem);
		double pincodeNum = Excel_Util.readNumericData("userdata.xlsx", "PincodeNum", 1, 0);
		System.out.println(pincodeNum);
		String pin = Double.toString(pincodeNum);
		HomePage hp = new HomePage();
	    SofaPage sp = new SofaPage();   
	    hp.entersearchdata(searchItem);
	    hp.clickOnSearchButton();
	    sp.clickOnSofaLink();
		ArrayList<String> tabs2 = new ArrayList<String> (BaseTestScript.driver.getWindowHandles());
	    BaseTestScript.driver.switchTo().window(tabs2.get(1));
	    sp.enterPincode(pin);
	    sp.clickOnCheckPin();
	    Thread.sleep(5000);
	   
		}


}
