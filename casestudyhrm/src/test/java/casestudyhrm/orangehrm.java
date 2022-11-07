package casestudyhrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class orangehrm {
	
	public static String vishnu="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@BeforeTest
	public void BT() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(vishnu);
		
		Thread.sleep(3000);
	}
	@Test(priority = 0)
	public void testcase1() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void testcase2()
	{
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + link.size() );
		
	}
	@Test(priority = 2)
	public void testcase3() throws InterruptedException
	{
		
		
		
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4).click();
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(4).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();
	    Thread.sleep(3000);
		
		
	}
	@AfterTest(enabled = true)
	  public void AT() throws InterruptedException
	  {
		
		  driver.quit();
	  }
}

