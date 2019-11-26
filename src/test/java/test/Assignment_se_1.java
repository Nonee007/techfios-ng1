package test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test case-
//1. Go to http://newtours.demoaut.com/mercurywelcome.php
//2. Verify title match: Welcome: Mercury Tours
//2. Enter username: mercury
//3. Enter password: mercury
//4. Click sign-in (Hint: Incorporate implicit wait or Thread.sleep)
//5. Verify SIGN-OFF button displayed
public class Assignment_se_1 {
	@Test
	public void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
    WebDriver driver= new ChromeDriver(); 
    driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    Thread.sleep(500);
    driver.findElement(By.name("userName")).sendKeys("mercury");
    Thread.sleep(500);
    driver.findElement(By.name("password")).sendKeys("mercury");
    Thread.sleep(500);
    driver.findElement(By.name("login")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("SIGN-OFF"));
    driver.close();
    driver.quit();
}
}