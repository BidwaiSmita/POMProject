package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

        WebDriver driver;

        By username = By.name("username");
        By password = By.name("password");
        By loginBtn = By.xpath("//button[text()=' Login ']");

        public LoginPage(WebDriver driver){
            this.driver = driver;
        }

        //method to perform the login using the below input values
        public void login(String user , String pass){
            driver.findElement(username).sendKeys("Admin");
            driver.findElement(password).sendKeys("admin123");
            driver.findElement(loginBtn).click();
        }
}
