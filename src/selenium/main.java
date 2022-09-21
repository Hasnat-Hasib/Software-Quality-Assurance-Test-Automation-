package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class main {
    public static WebDriver driver;

    public static void main(String[] args) {

        // Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("http://automationpractice.com/index.php");

        //Find element by ID
        //driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");

        WebElement search = driver.findElement(By.id("search_query_top"));
        search.sendKeys("T-Shirts");

        //Navigate to the URL
        driver.get("https://google.com/");
        // finding number of elements.
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for (WebElement l : link) {
            System.out.println(l.getText());
        }
    }
}
