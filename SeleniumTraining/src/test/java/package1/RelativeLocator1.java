package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator1 {

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//
//        WebElement searchElement = driver.findElement(By.id("small-searchterms"));
//        searchElement.sendKeys("Computers");
//        Thread.sleep(2000);
//
//        WebElement searchbtn=driver.findElement(with(By.tagName("input")).toRightOf(searchElement));
//        driver.findElement(with(By.tagName("span")).above(searchbtn)).click();
        
//        driver.get("https://demoapps.qspiders.com/ui");
//        Thread.sleep(2000);
//        WebElement ele=  driver.findElement(By.cssSelector("input[placeholder=\"Enter your name\"]"));
//        ele.sendKeys("naveen@gmail.com");
    	
    	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(5000);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Naveen Kumar");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("testmail@email.co");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		password.sendKeys("password");
		
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));
		btn.click();

       
        
        
        
        
    }
}