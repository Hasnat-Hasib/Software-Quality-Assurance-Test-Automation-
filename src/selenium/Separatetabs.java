package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class Separatetabs {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        WebElement column = driver.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]"));
        int colsize = column.findElements(By.tagName("a")).size();
        System.out.println(colsize);
        // Opening a new window by clicking on a link
        for (int i = 0; i<colsize; i++){
            String newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            column.findElements(By.tagName("a")).get(i).sendKeys(newtab);
            Thread.sleep(5000L);
        }

        //Getting title of the child window
        Set<String> win = driver.getWindowHandles();
        Iterator<String> iter = win.iterator();
        while (iter.hasNext()){
            driver.switchTo().window(iter.next());
            System.out.println(driver.getTitle());
        }



    }
}
