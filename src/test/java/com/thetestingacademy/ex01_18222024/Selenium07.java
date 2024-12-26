package com.thetestingacademy.ex01_18222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium07 {
    public static void main(String[] args) throws InterruptedException {
   EdgeDriver driver = new EdgeDriver();
   driver.get("https://sdet.live");

   driver.manage().window().maximize();
   Thread.sleep(5000);
   driver.quit();

}
}