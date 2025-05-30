package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class LoginTestData extends BaseClass {

    @Test
    public void testLoginWithExcelDate(){
        ExcelUtil.loadExcelFile("dataForLogin.xlsx","Sheet1");

        String username = ExcelUtil.getCellData(1,0); //Row:2 , Column:0
        String password = ExcelUtil.getCellData(1 ,1);// row 2 column 1

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username,password);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
