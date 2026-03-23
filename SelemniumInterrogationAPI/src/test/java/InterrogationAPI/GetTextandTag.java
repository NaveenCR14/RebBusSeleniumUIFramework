package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextandTag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

//		Locating The About link
		WebElement aboutLink = driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of the link : " + aboutLink.getText());

//		Fetching the tag name
		System.out.println("Tag name of the link : " + aboutLink.getTagName());

		driver.quit();
	}

}
