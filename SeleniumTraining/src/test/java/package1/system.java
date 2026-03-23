package package1;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.openqa.selenium.*;

public class system {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
////		Loggin IN
//		
//		Thread.sleep(6000);
//		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("admin123",Keys.ENTER);
//		Thread.sleep(6000);
		login.loginHrm(driver);
		
//		Recruitment
		Thread.sleep(4000);
		driver.findElement(By.xpath(
			    "//a[contains(@href,'recruitment')]"
			)).click();
		
//		Clicking Add Candidate
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		
//		Add Name email and save and logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("Naveennn");
		
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]")).sendKeys("Kumar");
//		
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("naveen@gmail.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("p[class=\"oxd-userdropdown-name\"]")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[href=\"/web/index.php/auth/logout\"]")).click();
		
		
		login.loginHrm(driver);

		
//		Recruitment
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		
		
		
		
		
		
		
	
	}

}
