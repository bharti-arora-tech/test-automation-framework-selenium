package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
DriverManager controls browser lifecycle.
ThreadLocal ensures parallel test execution
without driver conflicts.
*/

public class DriverManager {

private static ThreadLocal<WebDriver> driver =
new ThreadLocal<>();

public static void initDriver() {

WebDriverManager.chromedriver().setup();

driver.set(new ChromeDriver());

driver.get().manage().window().maximize();
}

public static WebDriver getDriver() {

return driver.get();
}

public static void quitDriver() {

driver.get().quit();

driver.remove();
}

}
