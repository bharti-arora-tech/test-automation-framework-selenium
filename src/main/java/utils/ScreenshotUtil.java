package utils;

import drivers.DriverManager;
import org.openqa.selenium.*;

import java.io.File;
import java.nio.file.Files;

/*
Captures screenshot whenever test fails
and stores it for Extent Report.
*/

public class ScreenshotUtils {

public static String capture(String name){

try{

TakesScreenshot ts=
(TakesScreenshot)DriverManager.getDriver();

File src=ts.getScreenshotAs(OutputType.FILE);

String path="reports/"+name+".png";

File dest=new File(path);

Files.copy(src.toPath(),dest.toPath());

return path;

}catch(Exception e){

return null;

}

}

}
