package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	@Test
	public void openGoogleSite() {
		//setting chrome driver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//create an object of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//go to google site
		
		driver.get("https://www.google.com/");
	}
	}

