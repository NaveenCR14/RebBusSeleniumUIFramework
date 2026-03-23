package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingNewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/");
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/");
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);

		driver.quit();
	}
}
