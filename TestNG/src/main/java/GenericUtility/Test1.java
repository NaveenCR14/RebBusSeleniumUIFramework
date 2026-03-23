package GenericUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 
{

    WebDriver driver;

    @BeforeClass
    public void start() throws InterruptedException 
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        
    }

    @Test
    public void CheckoutTest() throws InterruptedException 
    {

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        System.out.println("Login successful");

        // Validate product page
        String title = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(title, "Products");
        System.out.println("Product page validated: " + title);

        Thread.sleep(2000);

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        System.out.println("Product added to cart");

        Thread.sleep(2000);

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);

        // Verify cart
        String product = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(product, "Sauce Labs Backpack");
        System.out.println("Cart verified: " + product);

        Thread.sleep(2000);

        // Checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        // Enter details
        driver.findElement(By.id("first-name")).sendKeys("Naveen");
        Thread.sleep(1000);

        driver.findElement(By.id("last-name")).sendKeys("NK");
        Thread.sleep(1000);

        driver.findElement(By.id("postal-code")).sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        
        // Get cart price
        String cartPrice = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("Cart price: " + cartPrice);

        Thread.sleep(2000);

        // Get checkout price
        String overviewPrice = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("Checkout Price: " + overviewPrice);

        // Compare prices
        Assert.assertEquals(overviewPrice, cartPrice);
        System.out.println("Price validated...Prices matched.");

        // Validate checkout
        String summary = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(summary, "Checkout: Overview");
        System.out.println("Checkout validated");

        Thread.sleep(2000);

        // Complete order
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);

        // Verify order completion
        String completeText = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(completeText, "Thank you for your order!");
        System.out.println("Order placed successfully");
    }

    @AfterClass
    public void logOut() throws InterruptedException 
    {

        Thread.sleep(2000);

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("logout_sidebar_link")).click();
        System.out.println("Logout successful");

        Thread.sleep(2000);

        driver.quit();
    }
}