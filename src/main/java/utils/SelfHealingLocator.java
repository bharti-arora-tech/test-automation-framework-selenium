package utils;

import drivers.DriverManager;
import org.openqa.selenium.*;

/*
SelfHealingLocator tries primary locator first.
If it fails, it automatically tries backup locator.
*/

public class SelfHealingLocator {

public static WebElement find(By primary, By backup){

try{

return DriverManager.getDriver().findElement(primary);

}

catch(Exception e){

return DriverManager.getDriver().findElement(backup);

}

}

}
