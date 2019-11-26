package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_se_3 {
@Test
public void Transfer_money () throws InterruptedException {
	//Test case- Transfer Money
	//1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
	//2. Enter username: techfiosdemo@gmail.com
	//3. Enter password: abc123
	//4. Click login button
	//5. Click on Transactions in the Side Navigation
	//6. Click on transfer
	//7. Fill in the New Transfer Form,
	//8. Click submit,
	//9. Validate transfer posted on the table.
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://techfios.com/test/billing/?ng=admin/");
    Thread.sleep(800);
    driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	Thread.sleep(500);
	driver.findElement(By.id("password")).sendKeys("abc123");
	Thread.sleep(300);
	driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//span[contains(text(), 'Transactions')]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//a[contains(text(), 'Transfer')]")).click();
	Thread.sleep(300);
	//driver.findElement(By.xpath("//*[@id=/'tform/']/div[1]/div/span/span[1]/span/span[2]]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//select[@id='faccount']/option[text()='Checking']")).click();
	Thread.sleep(300);
	Select select = new Select(driver.findElement(By.id("taccount")));
	select.selectByVisibleText("house");
	Thread.sleep(300);
	driver.findElement(By.xpath("//div[@class= 'form-group']/descendant::input[@id= 'description']")).sendKeys("wer");
	Thread.sleep(300);
	driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("346545");
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	Thread.sleep(300);
	driver.close();
	driver.quit();
	
	
}
}
