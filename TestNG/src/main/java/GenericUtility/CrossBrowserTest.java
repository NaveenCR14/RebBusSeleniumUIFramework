package GenericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

public class CrossBrowserTest {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("---Executing Suite--", true);
	}

	@BeforeTest
	public void beforetest() {
		// TODO Auto-generated method stub
		Reporter.log("---Executing Test--", true);

	}

	@Parameters("browser")
	@BeforeClass
	void beforeclass(String browser) {

		// TODO Auto-generated method stub
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--incognito");
		copt.addArguments("--headless");

		EdgeOptions eopt = new EdgeOptions();
		eopt.addArguments("--inprivate");
		eopt.addArguments("--headless");

		FirefoxOptions fopt = new FirefoxOptions();
		fopt.addArguments("--private");
		fopt.addArguments("--headless");

		Reporter.log("--Executing addtocart class--,", true);
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(copt);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(fopt);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(eopt);
		} else {
			System.out.println("--give proper browser to launch");
		}
//		Reporter.log("---Executing before class--",true);
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--guest");
//
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        
		// Verification and Login
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	@Test
	@BeforeMethod
	public void beforemethod() {
		// TODO Auto-generated method stub
		Reporter.log("---Executing before method--", true);

	}

	@AfterMethod
	public void aftermethod() {
		// TODO Auto-generated method stub
		Reporter.log("---Executing after method--", true);

	}

	@AfterClass
	public void afterclass() {
		// TODO Auto-generated method stub
//		Reporter.log("---Executing After class --",true);
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//    	driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
	
	@AfterTest
	public void aftertest() {
		// TODO Auto-generated method stub
		Reporter.log("---Executing After test--", true);

	}

	@AfterSuite
	public void aftersuite() {
		// TODO Auto-generated method stub
		Reporter.log("---Executing After suite--", true);

	}
}