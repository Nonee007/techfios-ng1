package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Automation_testjunit {
@Test
	/*public void automationtestq1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Open Browser
		driver.get("http://techfios.com/test/101/");
		driver.findElement(By.xpath("//input[@name='allbox']")).click();
		//validate
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'todo')]")));
driver.quit();
}*/
//==========================================================================================================================
/*public void automationtestq2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");	
	driver.findElement(By.xpath("//input[@name='todo[0]']")).click();
	driver.findElement(By.xpath("//input[@value='Remove']")).click();
	Thread.sleep(500);
	//validate
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@name='todo[0]']")));
	driver.close();
	driver.quit();
	}*/
//========================================================================================================================
/*public void automationtestq3() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");		
	driver.findElement(By.xpath("//input[@name='allbox']")).click();
	driver.findElement(By.xpath("//input[@value='Remove']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[contains(@name, 'todo')]")));
	driver.close();
	driver.quit();
} */
//=======================================================================================================================
                  //TestNG
/*public void testngq1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");
	   driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("say");
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
//Validate
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='say']")));
}*/
//=================================================================================================================================
/*public void testngq2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");
	   driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("say");
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
	//validate
		String actual = "The category you want to add already exists";
		String expected = "The category you want to add already exists";
		Assert.assertEquals("Try a different one",expected, actual);
		}*/
//===============================================================================================================
/*public void testngq3() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");
// Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
	driver.findElement(By.xpath("//select[@name='due_month']")).click();
	//validate.
	String month = ("Month, Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec"); 
	 String expected = month;
	 String actual= month;		
	 Assert.assertEquals("oopsie", expected, actual);  
}*/
//===================================================================================================================	 
                                //Cucumber
/*public void cucumberq1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");
	driver.findElement(By.xpath("//button[contains(text(), 'Set SkyBlue Background')]")).click();
	}*/
//=======================================================================================================================	
public void cucumberq2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Open Browser
	driver.get("http://techfios.com/test/101/");	
	driver.findElement(By.xpath("//button[contains(text(), 'Set White Background')]")).click();
}	
}





	
	
	
	

