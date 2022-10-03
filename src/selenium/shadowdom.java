package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class shadowdom {

    public static WebDriver driver;

    public static void main(String[] args) {

        // Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();

//        //Navigate to the URL
        driver.get("https://books-pwakit.appspot.com/");

        //host
        WebElement host = driver.findElement(By.tagName("book-app"));
        //shadow dom
        JavascriptExecutor j = (JavascriptExecutor) driver;
        WebElement shadowdom = (WebElement) j.executeScript("return arguments[0].shadowRoot", host);

        //app header
        WebElement appheader = shadowdom.findElement(By.tagName("app-header"));
        //app-toolbar
        WebElement apptool = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        //book input
        WebElement book = apptool.findElement(By.tagName("book-input-decorator"));
        //input
        book.findElement(By.cssSelector("input#input")).sendKeys("Selenium Webdriver");

        driver.close();


    }
}


