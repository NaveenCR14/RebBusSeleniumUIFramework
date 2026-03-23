package NavigationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[title]")).sendKeys("Automation", Keys.ENTER);
		Thread.sleep(2000);

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);

		String s = driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]"));
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		String s1 = driver.getTitle();
		System.out.println(s1);

		driver.quit();
	}
}
