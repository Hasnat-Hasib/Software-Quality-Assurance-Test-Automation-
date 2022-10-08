package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Seleniumgrid {
    public static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        //Automated- chrome,firefox,ie,safari

        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        //dc.se

        //Webdriver driver=new ChromeDriver();
        WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
        driver.get("http://rediff.com");



        //
    }


}
