package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		

		WebElement b=driver.findElement(By.name("username"));
		b.sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[href=\"/web/index.php/pim/viewPimModule\"]")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("ash");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")).click();
		Thread.sleep(5000);
		
		
		WebElement element=driver.findElement(By.xpath("//h6[text()='Aakash Kumar']"));
		if(element.isDisplayed()) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("Failed");
		}
		
		
//	

	}

}
