package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Project-5 - ProjectName : com-ultimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

public class P5_UltimateQA {

    //1. Setup Chrome browser.
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //multiple browser set up
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();
        }else {
            System.out.println("Invalid Browser name");
        }

       // 2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println("Page Title : " + driver.getTitle());

        //4. Print the current url.
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("Page source : " + driver.getPageSource());

        //6. Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        //7. Print the current url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //8. Enter the email to email field.
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("testing@test.com");

        //9. Enter the password to password field.
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("TesttseT678");

        //10. Click on Login Button.
        WebElement signIn = driver.findElement(By.xpath("(//button [@type='submit'])"));
        signIn.click();

        //11. Navigate to baseUrl.
        driver.get(baseUrl);

        //12. Navigate forward to Homepage.
        driver.navigate().forward();

        //13. Navigate back to baseUrl.
        driver.navigate().back();

        //14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser.
        driver.quit();
    }
}
