package NavigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

//	Navigating to Google
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);

//	Navigating to Youtube
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);

//	Navigating to Wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);

		driver.quit();

	}
}
