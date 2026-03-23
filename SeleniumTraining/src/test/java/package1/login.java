package package1;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
//	public static void main(String[] args) {
//		
//		
//	}
	public static void loginHrm(WebDriver driver) throws InterruptedException {
//		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[placeholder='Username']"))
		        .sendKeys("Admin");

		driver.findElement(By.cssSelector("input[placeholder='Password']"))
		        .sendKeys("admin123");

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Thread.sleep(5000);

		
		
		
	}

}
