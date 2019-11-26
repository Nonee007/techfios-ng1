package test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
public class Assignment_se_2 {
	@Test
	//Testcase- Users will be able to add deposit
	//1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
	//2. Enter username: techfiosdemo@gmail.com
	//3. Enter password: abc123
	//4. Click login button
	//5. Click on Add Deposit button on Dashboard Page
	//6. Click on Account drop down to expand it,
	//7. Click on any account name,
	//8. Type any description,
	//9. Type any amount,
	//10. Click on submit button,
	//Visually check to make sure the deposit posted
	public void add_deposit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("password")).sendKeys("abc123");
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Add Deposit")).click();
		Thread.sleep(300);
		Select dropdown =new Select(driver.findElement(By.id("account")));
		dropdown.selectByIndex(2);
		Thread.sleep(300);
		driver.findElement(By.name("description")).sendKeys("for");
		Thread.sleep(300);
		driver.findElement(By.id("amount")).sendKeys("18700");
		Thread.sleep(400);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
	}
}
