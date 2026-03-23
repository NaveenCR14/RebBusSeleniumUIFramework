package JavaScriptPopus;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

//	Clicking the button for popup
		driver.findElement(By.cssSelector("[class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);

//	Using accept()
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

//	Clicking the button for popup
		driver.findElement(By.cssSelector("[class=\"btn btn-danger\"]")).click();
		Thread.sleep(2000);

//	Using dismiss()
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		driver.quit();
		
	}
}
