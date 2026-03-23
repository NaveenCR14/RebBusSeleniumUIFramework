package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);

//		Clicking on the Skills DropDown and Clicking on C
		WebElement sElement = driver.findElement(By.id("Skills"));

//		By findElement() Method
//		driver.findElement(By.cssSelector("[value=\"C\"]")).click();

//		Using Keys Class 
//		sElement.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.ENTER);

//		Create the Object of Select Class and pass the element reference
		Select select = new Select(sElement);

//		Select Class Methods 

		select.selectByVisibleText("SQL");
		Thread.sleep(2000);

		select.selectByIndex(2);
		Thread.sleep(2000);

		select.selectByContainsVisibleText("Backup");
		Thread.sleep(2000);

		select.selectByValue("APIs");
		Thread.sleep(2000);
		
		select.deselectAll();
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);

		driver.quit();
	}
}
