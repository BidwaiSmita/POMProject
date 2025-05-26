package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class adminPage extends BaseClass {


    public void adminPageClick(){
        driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text')]")).click();

        // Wait for dropdown to appear (optional but recommended)
        WebDriverWait driverWait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//span[text()='Admin']")));

        // Select "Admin"
        driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']")).click();}
}
