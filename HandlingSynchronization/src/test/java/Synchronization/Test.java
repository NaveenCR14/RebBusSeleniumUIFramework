package Synchronization;

import java.time.Duration;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://icehrmpro.gamonoid.com/login.php");
	
//	driver.findElement(By.id("username")).sendKeys("ad");
//	driver.findElement(By.id("password")).sendKeys("ad123");
//	
//	driver.findElement(By.xpath("//button[text()=\"Log in \"]")).click();
	
//	WebElement invalid= driver.findElement(By.cssSelector("[class=\"alert alert-danger\"]"));
//	
//	if(invalid.isDisplayed()) {
//		System.out.println("Invalid Credentials");
//	}
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	
	driver.findElement(By.xpath("//button[text()=\"Log in \"]")).click();
	
	if(driver.getCurrentUrl().contains("dashboard")) {
		System.out.println("DashBoard Page Displayed");
	}
	
	driver.findElement(By.xpath("//span[text()='Employees']/..")).click();
	driver.findElement(By.xpath("//a[@href=\"https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees\"]/.. ")).click();
//	driver.findElement(By.xpath("//span[text()='Filter Employees']/..")).click();
//	WebElement element= driver.findElement(By.id("rc_select_5"));
//	element.click();
//	element.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='Save']/..")).click();
//	WebElement validat= driver.findElement(By.xpath("//div[text()='Head Office | Pre-Sales Executive']/following::div[text()='Head Office | Department Head']"));
//	if(validat.equals("Head Office"));{
//		System.out.println("Verified");
//	}
//	driver.findElement(By.xpath("//span[text()='Filter Employees']/..")).click();
//	element.click();
//	element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='Save']/..")).click();
	
//	element.click();
//	element.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	driver.findElement(By.cssSelector("[id='tabEmployeeSkill']")).click();
	driver.findElement(By.xpath("//span[text() =(' Add New')]/..")).click();
	WebElement verifi= driver.findElement(By.xpath("//span[text()='Cancel']/.."));
	if(verifi.isDisplayed()) {
		System.out.println("The Skill box Displayed");
	}
	verifi.click();
	driver.findElement(By.xpath("//span[text()='IceHrm ']")).click();
	driver.findElement(By.linkText("Sign out")).click();
	
	
}
}
