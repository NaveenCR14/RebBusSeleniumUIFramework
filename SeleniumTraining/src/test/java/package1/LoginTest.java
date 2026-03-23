package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch the Browser
        WebDriver driver = new FirefoxDriver();

        // Step 2: Navigate to web page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        // Step 3: Enter username and password
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");

        // Step 4: Click Login button
        driver.findElement(By.cssSelector("[type='submit']")).submit();

        Thread.sleep(5000);

//        driver.quit();
    }
}