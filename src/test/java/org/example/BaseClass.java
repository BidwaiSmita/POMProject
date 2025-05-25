package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {

    WebDriver driver = null;

    @BeforeMethod
    public void BasePage(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.quit();
    }
}
