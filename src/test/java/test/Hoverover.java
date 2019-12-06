package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hoverover
{


	@Test
	public void Validate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://techfios.com/test/101/");
	    Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@contains='todo']")).click();
		// String expected = "abc";
	//WebElement actual = driver.findElement(By.name("abc"));
	//actual.getText();
	
	}
}

















