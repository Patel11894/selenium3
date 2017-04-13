package filpkart_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExample {
    @Test
	public void testA() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");

	}

}
