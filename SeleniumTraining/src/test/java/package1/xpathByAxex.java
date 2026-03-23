package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathByAxex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
//	driver.get("https://www.google.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@title='Search']/parent::div/parent::div/parent::div/following-sibling::div[@class='FPdoLc lJ9FBc']/child::center/child::input[@value='Google Search']")).click();
	
	
	
//	driver.get("https://demowebshop.tricentis.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/parent::h2/parent::div/child::div[@class='add-info']/child::div[@class=\"buttons\"]/child::input")).click();
	
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div/child::div[@class=\"sliderFoot\"]/child::div/child::a")).click();
	
	
}
}
