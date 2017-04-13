package testmy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testA()
	{
	 System.setProperty("webdriver.chrome.driver", "chromedriver");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.google.com");
	}

}
