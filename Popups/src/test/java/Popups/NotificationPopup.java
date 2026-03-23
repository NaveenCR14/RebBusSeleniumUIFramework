package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		System.out.println("Name : " + options.getBrowserName());

		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(5000);

		driver.findElement(By.id("browNotButton")).click();
		Thread.sleep(20000);

		driver.quit();
	}
}
