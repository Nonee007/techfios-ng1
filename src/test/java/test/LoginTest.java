package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@Test
	public void launchGoogle() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.get("http://objectspy.space/");
		Thread.sleep(2000);
		driver.findElement(By.className("radio")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
