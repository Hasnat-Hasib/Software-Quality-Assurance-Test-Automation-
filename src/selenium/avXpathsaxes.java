package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class avXpathsaxes {
    public static WebDriver driver;
    public static void main(String[] args) {

        // Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        //Max the Chrome Browser
        driver.manage().window().maximize();

//        //Navigate to the URL
        driver.get("https://money.rediff.com/gainers");

        //self node
        String self_node = driver.findElement(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/self::a")).getText();
        System.out.println("Self node is "+ self_node);

        //Parent node
        String parent_Node = driver.findElement(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/parent::td")).getText();
        System.out.println("Parent node is "+ parent_Node);

        //child node
        List<WebElement> child_node = driver.findElements(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/ancestor::tr/child::*"));
        System.out.println("the no child node is   " + child_node.size());

        //Ancestor Node
        String ancestor_Node = driver.findElement(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/ancestor::tr")).getText();
        System.out.println("Parent node is "+ ancestor_Node);

        //following
        List<WebElement> following_node = driver.findElements(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/following::*"));
        System.out.println("the no following tag is   " + following_node.size());

        //following Siblings
        List<WebElement> following_sib = driver.findElements(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/ancestor::tr/following-sibling::*"));
        System.out.println("the no following sibling is   " + following_sib.size());

        //preceding
        List<WebElement> preceding_node = driver.findElements(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/preceding::*"));
        System.out.println("the no preceding tag is   " + preceding_node.size());

        //preceding Siblings
        List<WebElement> preceding_sib = driver.findElements(By.xpath("//a[contains(.,'Gokul Refoils & Solv')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("the no preceding sibling ta is   " + preceding_sib.size());

        driver.close();

    }
}
