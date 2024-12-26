package com.thetestingacademy.SeleniumProjectTask001_23122024;

//import org.assertj.core.api.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumProjectTask002 {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = new FirefoxDriver();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        // AssertJ Assertion
        //assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://awesomeqa.com/practice.html");


        Thread.sleep(3000);
        driver.quit();



    }
}
