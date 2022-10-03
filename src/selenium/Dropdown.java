package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();

////        //Navigate to the URL
//          driver.get("https://spicejet.com/");
//          //Checkbox
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeciorCitizenDiscout']")).isSelected());
//        driver.findElement(By.cssSelector("input[id*='SeciorCitizenDiscout']")).click();
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeciorCitizenDiscout']")).isSelected());
//        //Static Dropdown
////        Select s = new Select(driver.findElement(By.id()));
////         s.selectByIndex();
////        s.selectByValue();
////        s.selectByVisibleText();
//
//        //Updated dropdown
////        driver.findElement(By.id()).click();
////        Thread.sleep(2000L);
////        int i=1;
////        while (i<5){
////            driver.findElement(By.id()).click();
////            i++;
////        }
////        driver.findElement(By.id()).click();
////        System.out.println();
//
//        // Dynamic Dropdown
//        driver.findElement(By.id()).click();
//        driver.findElement(By.xpath("//a[]")).click();
//        Thread.sleep();
//         //duplicate values with index number
//        driver.findElement(By.xpath("(//a[])[]")).click();
//        //Pchild dropdownarent
//        driver.findElement(By.xpath("(//a[])[]")).click();
//
//
//        //Auto Suggestive Dropdown
//        WebElement source = driver.findElement(By.id());
//        source.clear();
//        source.sendKeys("");
//        Thread.sleep();
//        source.sendKeys(Keys.ENTER);    //Enter key from Keyboard
//
//        WebElement destination = driver.findElement(By.id());
//        destination.clear();
//        destination.sendKeys("");
//        Thread.sleep();
//        destination.sendKeys(Keys.ARROW_DOWN);    //Enter key from Keyboard
//        destination.sendKeys(Keys.ENTER);    //Enter key from Keyboard
//
//
//
//
//
//
 }
}
