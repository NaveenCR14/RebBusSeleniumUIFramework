package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMHardAssert {
	WebDriver driver;
	WebDriverWait wait;

	@Test(priority = 1)
	public void login() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}
	
	@Test(priority = 2)
	public void verify() {
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(actual, expected);
		assert1.assertAll();
		
//		Assert.assertEquals(actual, expected);
		
		System.out.println("Verification completed : Passed");
	}

	@Test(priority = 3)
	public void logOutOrangeHRM() {

		driver.findElement(By.xpath("//img[@src=\"/web/index.php/pim/viewPhoto/empNumber/7\"]")).click();

		driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();

		driver.quit();
	}
}