package SauceLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyInfoTest {

	
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("admin123",Keys.ENTER);
//		My Info
		driver.findElement(By.xpath("//span[.='My Info']")).click();
//		Adding Info
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement fn=driver.findElement(By.name("firstname"));
//		Actions act=new Actions(driver);
//		act.sendKeys(fn,Keys.BACK_SPACE);
		
	}
}
