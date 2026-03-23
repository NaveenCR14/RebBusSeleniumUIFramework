package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThreadClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.navigate().to("https://www.ebay.com/?msockid=2cbb1368951c6f3f159500ad94b16e90");
		Thread.sleep(1500, 100);

		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(Duration.ofSeconds(5));

		driver.quit();

	}
}
