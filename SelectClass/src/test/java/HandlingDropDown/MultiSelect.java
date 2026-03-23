package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);

		WebElement option = driver.findElement(By.cssSelector("[name=\"cars\"]"));

		Select select = new Select(option);
		select.selectByIndex(1);
		Thread.sleep(2000);

		select.selectByContainsVisibleText("Volvo");
		Thread.sleep(3000);

		select.selectByValue("audi");
		Thread.sleep(3000);

		select.selectByVisibleText("Saab");
		Thread.sleep(2000);

		select.deselectByIndex(1);
		Thread.sleep(2000);

		select.deSelectByContainsVisibleText("Volvo");
		Thread.sleep(3000);

		select.deselectByValue("audi");
		Thread.sleep(3000);

		select.deselectByVisibleText("Saab");
		Thread.sleep(2000);
		
		select.deselectAll();
		Thread.sleep(2000);
		
		select.selectByValue("audi");
		Thread.sleep(3000);

		select.selectByIndex(1);
		Thread.sleep(2000);

		select.selectByContainsVisibleText("Volvo");
		Thread.sleep(3000);
		
		List<WebElement> list =select.getAllSelectedOptions();
		for(WebElement i :list) {
			System.out.println(i.getAccessibleName());
		}
		
		System.out.println(select.getFirstSelectedOption().getAccessibleName());
		Thread.sleep(2000);

		driver.quit();

	}
}
