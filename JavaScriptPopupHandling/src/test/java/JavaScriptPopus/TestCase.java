package JavaScriptPopus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[placeholder=\"Search for products, brands and more\"]")).sendKeys("dresses",
				Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.id("36519615")).click();
		Thread.sleep(3000);

		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(driver.getWindowHandle());
		for (String s : allwindowid) {
			driver.switchTo().window(s);
		}

		driver.findElement(By.xpath("//span[text()=\"WISHLIST\"]/..")).click();
		Thread.sleep(3000);

		System.out.println(
				"Login Page is Displayed ? : " + driver.findElement(By.className("signInContainer")).isDisplayed());
		Thread.sleep(3000);

		driver.quit();

	}
}
