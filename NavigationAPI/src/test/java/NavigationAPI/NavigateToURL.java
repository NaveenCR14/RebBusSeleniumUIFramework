package NavigationAPI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToURL {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

//	Navigating to Amazon
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

//	Navigate To Flipkart
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);

//Navigating to UberEats
		driver.navigate().to(new URL("https://www.ubereats.com/in?msockid=2cbb1368951c6f3f159500ad94b16e90"));
		Thread.sleep(2000);

		driver.quit();

	}
}
