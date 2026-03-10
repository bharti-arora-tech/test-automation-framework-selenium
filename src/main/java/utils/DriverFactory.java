package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 DriverFactory handles browser creation.
 WebDriverManager automatically downloads correct ChromeDriver
 matching the installed Chrome browser version.
*/

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        // Automatically download and setup latest ChromeDriver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        // maximize browser window
        driver.manage().window().maximize();

        return driver;
    }
}
