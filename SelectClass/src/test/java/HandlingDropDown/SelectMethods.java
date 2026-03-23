package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);

		// Clicking on the Skills DropDown and Clicking on C
		WebElement sElement = driver.findElement(By.id("Skills"));

		// Create the Object of Select Class and pass the element reference
		Select select = new Select(sElement);

		// Select Class Methods

		select.selectByVisibleText("SQL");
		Thread.sleep(2000);

		select.selectByIndex(2);
		Thread.sleep(2000);

		select.selectByContainsVisibleText("Backup");
		Thread.sleep(2000);

		select.selectByValue("APIs");
		Thread.sleep(2000);
		
		WebElement element1=select.getFirstSelectedOption();
		System.out.println("First selected Option : "+element1.getText());
		
//		List<WebElement> allopt1 =select.getAllSelectedOptions();
//		for(WebElement element : allopt1) {
//			System.out.println(element.getText());
//		}

//		When the single select option is deselected UnsupportedOperationException is thrown
//		select.deselectAll();
//		Thread.sleep(2000);
		
		List<WebElement> allopt =select.getOptions();
		for(WebElement element : allopt) {
			System.out.println(element.getText());
		}
		
		System.out.println("Is multiple : "+select.isMultiple());
		
		Thread.sleep(2000);

		driver.quit();
	}

}
