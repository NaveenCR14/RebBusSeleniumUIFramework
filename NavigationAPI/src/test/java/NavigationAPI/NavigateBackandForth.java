package NavigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBackandForth {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

//	Navigating to Myntra
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);

//	Navigating to Bigbasket
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);

//	Navigating to Ajio
		driver.navigate().to("https://www.ajio.com/");
		Thread.sleep(2000);

//	Navigating Back to Bigbasket from ajio
		driver.navigate().back();
		System.out.println("Bigbasket : " + driver.getTitle());

//	Navigating Back to Myntra from Bigbasket
		driver.navigate().back();
		System.out.println("Myntra : " + driver.getTitle());

//	Navigating Forward to Bigbasket 
		driver.navigate().forward();
		System.out.println("Bigbasket : " + driver.getTitle());

//	Navigating Forward to ajio 
		driver.navigate().forward();
		System.out.println("Ajio : " + driver.getTitle());

		driver.quit();
	}
}
