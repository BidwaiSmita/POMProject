package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_OrangeHRM_001 {


    @Test
    public void baseMethod(){

        WebDriver driver = new ChromeDriver();
        TC_register_001 tcRegister001 =new TC_register_001();
        tcRegister001.VerifingRegistartionFields();

    }
}
