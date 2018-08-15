import com.VivaStreet.AllTestClasses;
import com.VivaStreet.QRCodeHelper;
import com.VivaStreet.Screener;
import com.google.zxing.NotFoundException;
//import com.sun.jndi.toolkit.url.Uri;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URI;
import java.net.URL;


public class TestScreenCompare {

    public  String testName;


     @org.testng.annotations.Test
     public void testOne() throws IOException {
         testName = Thread.currentThread().getStackTrace()[1].getMethodName();
         WebDriver driver;
         DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();


         driver = new RemoteWebDriver(new URL("http:localhost:4446/wd/hub"), desiredCapabilities);

         driver.get("http://youtube.com");
         Screener.takeScreenShot(driver, testName);


         driver.close();


     }




     @org.testng.annotations.Test
     public void testTwo() throws IOException {

         testName = Thread.currentThread().getStackTrace()[1].getMethodName();
         WebDriver driver;

         DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();


         driver = new RemoteWebDriver(new URL("http:localhost:4446/wd/hub"), desiredCapabilities);

         driver.get("https://google.com");


         Screener.takeScreenShot(driver, testName);


         driver.close();
         driver.quit();


     }


        @org.testng.annotations.Test
         public void testThree() throws IOException {

            testName = Thread.currentThread().getStackTrace()[1].getMethodName();
            WebDriver driver;

            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

            driver = new RemoteWebDriver(new URL("http:localhost:4446/wd/hub"), desiredCapabilities);

            driver.get("https://mail.com");


            Screener.takeScreenShot(driver, testName);


            driver.close();
            driver.quit();


        }
}