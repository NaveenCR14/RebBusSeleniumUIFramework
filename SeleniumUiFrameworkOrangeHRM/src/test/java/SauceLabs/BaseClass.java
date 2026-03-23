package SauceLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("--Executing Suite--", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("--Executing before Suite--", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("--Executing before Class--", true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Login with valid Credentials
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("--Executing before Method--", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("--Executing after Method--", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("--Executing after Class--", true);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("--Executing after Test--", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("--Executing after Suite--", true);
	}
}
