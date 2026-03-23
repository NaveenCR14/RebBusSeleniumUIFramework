package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDsiplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(5000);

//		Locating the Button
		WebElement btnElement = driver.findElement(By.xpath("//button[.='Register']"));

//		Verifying the button is displayed
		System.out.println("The Button is Displayed : " + btnElement.isDisplayed());

		driver.quit();

	}
}
