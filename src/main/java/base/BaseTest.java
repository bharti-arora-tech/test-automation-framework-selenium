package base;

import drivers.DriverManager;
import org.testng.annotations.*;

/*
BaseTest initializes browser before every test
and closes it after execution.
*/

public class BaseTest {

@BeforeMethod
public void setup() {

DriverManager.initDriver();
}

@AfterMethod
public void teardown() {

DriverManager.quitDriver();
}

}
