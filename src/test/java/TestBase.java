import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public  static  RemoteWebDriver driver;
   @Before
   // @Parameters({"browser"})
    public void setup(String browser) throws MalformedURLException {

        //WebDriver driver;
        // String browser = null;
        DesiredCapabilities desiredCapabilities=null;
//        if (browser.equalsIgnoreCase("chrome")){
//         desiredCapabilities = DesiredCapabilities.chrome();
//         desiredCapabilities.setBrowserName("chrome");
//
//        }
        //else if (browser.equalsIgnoreCase("firefox")){
            desiredCapabilities = DesiredCapabilities.firefox();
            desiredCapabilities.setBrowserName("firefox");


        desiredCapabilities.setCapability("platform", "LINUX");
        driver = new RemoteWebDriver(new URL("http:localhost:4446/wd/hub"), desiredCapabilities);


    }

  @After
    public  void tearDown(){


        driver.close();
        driver.quit();


    }


}
