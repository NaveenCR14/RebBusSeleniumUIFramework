package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

//		Enter the first name
		WebElement firstName = driver.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
		firstName.sendKeys("Naveen");

//		Enter the last name
		WebElement lastName = driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]"));
		lastName.sendKeys("Kumar");

//		Clearing the first name
		Thread.sleep(2000);
		firstName.clear();
		Thread.sleep(2000);

//		Enter the first name
		firstName.sendKeys("Navin");
		
//		Radio button cant clear so gets InvalidElementState Exception
		driver.findElement(By.cssSelector("[value=\"Male\"]")).clear();
	}
}
