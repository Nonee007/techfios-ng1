package test;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Assignment_se_4 {
	@Test	
	//Scenario: CRM -> Add Contact - Add contact and validate contact added in List Contacts
	//1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
	//2. Enter username: techfiosdemo@gmail.com
	//3. Enter password: abc123
	//4. Click login button
	//5. Click on CRM in the Side Navigation
	//6. Click on Add Contact
	//7. Fill in the Add Contact Form,
	//8. Click submit,
	//9. Go to CRM -> List Contact Page
	//10. Search for the new contact in the search field,
	//12. Validate contact created.- cannot validate​

/*public void addContact() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
WebDriver driver= new ChromeDriver(); 
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//Open Browser
driver.get("http://techfios.com/test/billing/?ng=admin/");
Thread.sleep(300);
//Enter username:
driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
//Enter password
driver.findElement(By.id("password")).sendKeys("abc123");
//submit
driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
Thread.sleep(500);
//find crm
driver.findElement(By.xpath("//span[text()= 'CRM']")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//a[text()='Add Contact']")).click();
Thread.sleep(500);
//add account form.
driver.findElement(By.xpath("//input[@id='account']")).sendKeys("s5f");
driver.findElement(By.xpath("//input[@id='company']")).sendKeys("s5f");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("s5f@gmail.com");
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(500);
driver.switchTo().parentFrame();
Thread.sleep(700);
driver.findElement(By.xpath("//span[text()= 'CRM']")).click();
Thread.sleep(700);
driver.findElement(By.xpath("//span[text()= 'CRM']")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//a[text()='List Contacts']")).click();
Thread.sleep(500);
//to validate by assert failing here. cannot validate
Assert.assertEquals("contacts Page didn't Display", driver.findElement(By.xpath("//h2[text()='Contacts']")));
//assertEquals.("Fail", driver.findElement(By.xpath("//h2[text()='Contacts']")).getText());
driver.close();
driver.quit();	}*/
	//===================================================================================
	//Alert/Pop ups. working.
	/*public void alert_popups() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("4543534");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(500);
		driver.switchTo().alert().dismiss();
		driver.close();
		driver.quit();	
}
}*/
	//=====================================================================================
	//Hover Over. working.
	
	 /* public void hover_over() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver= new ChromeDriver(); driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.dell.com/en-us");
	  Thread.sleep(500);
	  Actions action =new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("/html/body/header/div[3]/nav/ul/li[1]/button"))).build().perform();
	  waitForElement(driver, 30, By.linkText("Workstations"));
	  driver.findElement(By.linkText("Workstations")).click();
	  waitForElement(driver, 15, By.xpath("//h1[contains(text(),'Precision') and contains(text(), 'Workstation')]"));
	  driver.close();
		driver.quit();
	  }

	private void waitForElement(WebDriver driver, int i, By linkText) {
		
	}
}*/
//=================================================================================================================================		
	//Handle New Window.
	/*public void handleNewWindowOrTab() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("xpath");
		driver.findElement(By.id("uh-search-button")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("XPath Tutorial - w3schools.com")).click();

		//This will print all the window handles (which are unique numbers)
		System.out.println(driver.getWindowHandles());

		//To loop around and end in the last window
		for (String windowHandle : driver.getWindowHandles()) {
		driver.switchTo().window(windowHandle);
		}

		Thread.sleep(2000);
		driver.findElement(By.linkText("SQL")).click();
	}
}
*/
//===========================================================================================================================================	
	//Scroll up and Down.
/*public void scrollUpOrDown() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Actions action = new Actions(driver);
driver.get("https://www.yahoo.com/");
scrollDown(driver);
Thread.sleep(2000);
scrollUp(driver);
}

private void scrollDown(WebDriver a) {
((JavascriptExecutor)a).executeScript("scroll(0,2000)");
}
private void scrollUp(WebDriver a) {
JavascriptExecutor js = (JavascriptExecutor)a;
js.executeScript("scroll(2000,0)");
}
}
*/
//===========================================================================================================================
	//Handle iFrame.
	public void handleiFrames() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to the Oracle site
		// click on the java.awt.color link
		// Click on the ColorSpace link
		// Click on the Serializable link
		// validate "Interface Serializable" showed

		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		// switch by index
		// driver.switchTo().frame(0);
		// switch by name
		driver.switchTo().frame("packageListFrame");

		driver.findElement(By.linkText("java.awt.color")).click();

		// move the driver to the default location
		driver.switchTo().defaultContent();

		// switch to frame #2 with index
		driver.switchTo().frame(1);
		// explicit wait on the following element before click.
		//getting stuck at this point.
		waitForElement(driver, 40, By.linkText("ColorSpace"));
		driver.findElement(By.linkText("ColorSpace")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("Serializable")).click();
		}

		//Explicit wait encapsulated in a method
		private void waitForElement(WebDriver driver, int timeToWaitInSeconds, By ElementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementLocator));
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
//}
                                                                                                                                                                                                                                                                                                                                                                               