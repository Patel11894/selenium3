package filpkart_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
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

}
