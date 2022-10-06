package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Handlewindow {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
        System.out.println("Before opening new window");
        System.out.println(driver.getTitle());
        Set <String> winds = driver.getWindowHandles();
        Iterator <String> iter = winds.iterator();
        String parent = iter.next();
        String child = iter.next();
        driver.switchTo().window(child);
        //After opening new window
        System.out.println("After Switching");
        System.out.println(driver.getTitle());


    }
}
