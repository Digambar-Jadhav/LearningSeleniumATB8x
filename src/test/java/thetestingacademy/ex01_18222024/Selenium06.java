package thetestingacademy.ex01_18222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium06 {
    public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new FirefoxDriver();
   driver.get("https://sdet.live");

   driver.manage().window().maximize();
   Thread.sleep(5000);
   driver.quit();

}
}