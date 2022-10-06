package selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Movingmouse {
    public static WebDriver driver;

    Duration timeout;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        Actions ac = new Actions(driver);
        //Writing in Capital Letters
        ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("T-Shirts").doubleClick().build().perform();
        //Moving to Specific element
        ac.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        //Right-click on a Element
        ac.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();

        driver.close();

    }
}