package filpkart_project;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTestScript {
	
	public static WebDriver driver = null;
	
	
	@BeforeMethod
	public void openBrowser() throws InvalidFormatException, IOException
	{
	
		String url = Excel_Util.readData("userdata.xlsx","BrowserInfo", 1, 1);
		System.out.println(url);
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
    @AfterMethod
	public void closeBrowser()
	{
		  BaseTestScript.driver.quit();
	}
    
    @AfterSuite
    public void takeReport()
    {
    	Date d1 = new Date();
    	 
    	String cuuentDateAndTime = d1.toString().replace(':', '_');
    	
    	File src = new File("./test-output");
    	
    	File dest = new File("./Reports/" +cuuentDateAndTime +".zip");
    	
    	Zip z = new Zip();
    	try
    	{
    	 z.zip(src, dest);	
    	}
    	catch(IOException e)
    	{
    		
    	}
    }

}
