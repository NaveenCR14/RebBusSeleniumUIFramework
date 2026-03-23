package JavaScriptPopus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PromptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("[href=\"#Textbox\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);

		alert.sendKeys("Naveen Kumar");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(2000);

		driver.close();
	}
}
