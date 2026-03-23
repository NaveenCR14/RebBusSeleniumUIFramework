package Popups;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase03 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[.='Admin']")).click();

		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button")).click();

		WebElement dropdown = driver.findElement(By.xpath("((//div[@class='oxd-select-text-input'])[1])"));
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		if(dropdown.getText().contains("Admin"))
			System.out.println("first select verfied");
		dropdown.click();
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		if(dropdown.getText().contains("ESS"))
			System.out.println("Second select verfied");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();
		Thread.sleep(5000);
		driver.quit();
	}


	
	
	
		

//	
//	WebElement element= driver.findElement(By.linkText("OrangeHRM, Inc"));
//	String parentID =driver.getWindowHandle();
//	element.click();
//	Thread.sleep(4000);
//	
//	Set<String> allwindowId=driver.getWindowHandles();
//	
//	allwindowId.remove(parentID);
//	for(String i :allwindowId) {
//		driver.switchTo().window(i);
//	}
//	String currentUrl=driver.getCurrentUrl();
//	if(currentUrl.contains("orangehrm.com")) {
//		System.out.println("Verified URL");
//	}
//	else {
//		System.out.println("Not Verified");
//	}
//	String title=driver.getTitle();
//	if(title.isEmpty()) {
//		System.out.println("Title is Empty");
//	}
//	else {
//		System.out.println("Title is not Empty");
//	}
//	driver.close();
//	Thread.sleep(4000);
//	driver.switchTo().window(parentID);
//	Thread.sleep(4000);
//	String currentUrl1=driver.getCurrentUrl();
//	if(currentUrl1.contains("login")) {
//		System.out.println("Login Page is Displayed");
//	}
//	else {
//		System.out.println("Not Displayed");
//	}
//	

	}

