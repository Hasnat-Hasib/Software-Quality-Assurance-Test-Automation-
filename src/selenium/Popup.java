package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class Popup {
    public static WebDriver driver;
    public static void main(String[] args) {

        //Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();
        //Navigate to the URL
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
        driver.switchTo().alert().accept();


        //driver.switchTo().alert().sendKeys("feedback);
        //driver.switchTo().alert().dismiss();
        //driver.close();

    }
}
