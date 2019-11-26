package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	//12. Validate contact created.​

/*public void addContact() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
WebDriver driver= new ChromeDriver(); 
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("http://techfios.com/test/billing/?ng=admin/");
driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
Thread.sleep(500);
driver.findElement(By.id("password")).sendKeys("abc123");
Thread.sleep(300);
driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//span[text()= 'CRM']")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//a[text()='Add Contact']")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//input[@id='account']")).sendKeys("jigiiifbd");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@id='company']")).sendKeys("RigiH");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7igi8@gmail.com");
Thread.sleep(300);
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//span[text()= 'CRM']")).click();
Thread.sleep(300);
driver.findElement(By.xpath("//a[text()='List Contacts']")).click();
Thread.sleep(3000);
WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Contacts ']")));
driver.close();
driver.quit();	}
	//===================================================================================
	//Alert/Pop ups.
	public void alert_popups() throws InterruptedException {
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
}*/
	//=====================================================================================
	//Hover Over.
	public void hover_over() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Products"))).build().perform();

		waitForElement(driver, 15, By.linkText("Workstations"));

		driver.findElement(By.linkText("Workstations")).click();

		waitForElement(driver, 15, By.xpath("//h1[contains(text(),'Precdfgdfision') and contains(text(), 'Workstation')]"));
		}
		private void waitForElement(WebDriver driver, int timeToWaitInSeconds, By ElementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementLocator));
	//Handle New Window.
	//Scroll up and Down.
	//Handle iFrame.
}
}