package tests;

import framework.base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationTests extends BaseTest {

    /*
     Test Case:
     Login with invalid credentials
    */

    @Test
    public void invalidLoginTest() {

        driver.findElement(By.linkText("Signup / Login")).click();

        driver.findElement(By.name("email"))
                .sendKeys("invalid@test.com");

        driver.findElement(By.name("password"))
                .sendKeys("wrongpass");

        driver.findElement(By.xpath("//button[text()='Login']"))
                .click();

        String error =
                driver.findElement(By.xpath(
                        "//p[contains(text(),'incorrect')]"))
                        .getText();

        Assert.assertTrue(error.contains("incorrect"));
    }
}
