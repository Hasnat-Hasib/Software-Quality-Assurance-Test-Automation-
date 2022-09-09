package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static WebDriver driver;
    public static void main (String[] args) {

        // Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("http://automationpractice.com/index.php");

    }
}
