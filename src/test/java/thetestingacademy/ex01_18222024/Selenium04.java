
package thetestingacademy.ex01_18222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium04 {

    @Test
    public void test_Selenium() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(3000);
        driver.quit();

    }


}
