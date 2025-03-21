package thetestingacademy.ex01_18222024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium09 {
   @Test
   public void testmethod01() throws InterruptedException {

      // EdgeOptions -> It will help you set the browser
      // options to browsers
      // window - size
      // headless mode - there is not UI -> advantage - Fast Execution
      // full UI mode - default - UI browser
      // incognito mode - switch
      // start Max
      // add extensions - browsers
      // 100 + others , https , http
      // localstorage, download ?
      EdgeOptions edgeOptions = new EdgeOptions();

//        edgeOptions.addArguments("--start-maximized");
     edgeOptions.addArguments("--window-size=1920,1080");
     edgeOptions.addArguments("--incognito");
     edgeOptions.addArguments("--headless");



      EdgeDriver driver = new EdgeDriver();
      driver.get("https://google.com");
      System.out.println(driver.getTitle());
      Thread.sleep(5000);
      driver.quit();





   }
}