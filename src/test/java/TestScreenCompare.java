import com.VivaStreet.AllTestClasses;
import com.VivaStreet.QRCodeHelper;
import com.VivaStreet.Screener;
import com.google.zxing.NotFoundException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class TestScreenCompare {

     @Test
   public void testOne() throws IOException, NotFoundException {

         Screener.setChildDirectory(Thread.currentThread().getStackTrace()[1].getMethodName());

        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.co.uk");

       Screener.takeScreenShot(driver,"Player");

        // System.out.println( methName);
       driver.close();


    }

}