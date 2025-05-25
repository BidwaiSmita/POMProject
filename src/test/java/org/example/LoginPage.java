package org.example;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    public void login(){
        driver.findElement(By.name("username")).sendKeys("Admin");

    }
}
