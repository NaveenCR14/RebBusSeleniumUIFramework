package InterrogationAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class SwitchTo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Thread.sleep(2000);

        String parentID = driver.getWindowHandle();
        String fbID = "";
        String twitterID = "";

        System.out.println("Parent Session ID : " + parentID);

        // Click Facebook
        driver.findElement(By.xpath("//a[text()='Facebook']")).click();
        Thread.sleep(2000);

        // Click Twitter
        driver.findElement(By.xpath("//a[text()='Twitter']")).click();
        Thread.sleep(2000);

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {

            driver.switchTo().window(window);

            String currentURL = driver.getCurrentUrl();
            System.out.println("Current URL : " + currentURL);

            if (currentURL.contains("facebook")) {
                fbID = window;
                System.out.println("Facebook Session ID Verified : " + fbID);
            }

            else if (currentURL.contains("twitter") || currentURL.contains("x.com")) {
                twitterID = window;
                System.out.println("Twitter Session ID Verified : " + twitterID);
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentID);
        System.out.println("Back to Parent Session ID : " + driver.getWindowHandle());

        driver.quit();
    }
}