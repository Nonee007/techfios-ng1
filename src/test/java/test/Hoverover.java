package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hoverover {
	@Test
	public void Validate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.dell.com/en-us");
	    //WebElement SOLUTIONS_MODULE_ELEMENT = driver.findElement(By.xpath("")).
	    Thread.sleep(500);
		
		
		
	}

}
