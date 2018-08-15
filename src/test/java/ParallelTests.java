import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class ParallelTests extends  TestBase{




@org.junit.Test
    public void testingOne() throws IOException, InterruptedException {


        driver.get("https://thathrowdown.com");
        driver.findElement(By.linkText("Video")).click();


       //Thread.sleep(6000);



    }



}
