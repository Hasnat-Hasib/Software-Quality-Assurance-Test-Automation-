package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.WebDriver;


public class RadioButton {
    public static WebDriver driver;
    public static void main(String[] args) {
         //Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();
        //Navigate to the URL
        driver.get("https://echoecho.com/htmlforms10.htm");

        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
        for(int i = 0; i<count; i++){
            String tx = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            if(tx.equals("Cheese")){
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }
        }


    }
}
