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

//        //Navigate to the URL
       // driver.get("http://automationpractice.com/index.php");

        //Find element by ID
        //driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
//
//        WebElement search = driver.findElement(By.id("search_query_top"));
//        search.sendKeys("T-Shirts");
//
//        //Navigate to the URL
//        driver.get("https://google.com/");
//        // finding number of elements.
//        List<WebElement> link = driver.findElements(By.tagName("a"));
//        System.out.println(link.size());
//
//        for (WebElement l : link) {
//            System.out.println(l.getText());
//        }

        driver.get("https://www.ebay.com/");
    //Enter valid user name
        //xpath abs
       // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("Pants");
    // Password
       // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
    // click on login
        //driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

    //xpath relative
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Pants");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
//        driver.findElement(By.xpath("//input[@id='gh-d']")).sendKeys("shirts");
//        driver.findElement(By.xpath("//input[contains@name, '_gh-d']")).sendKeys("shirts");
//        driver.findElement(By.xpath("//input[starts-with@name, '_gh-d']")).sendKeys("shirts");
//          driver.findElement(By.xpath("//a[text()= 'sell]']")).click();

    }
}
