import com.VivaStreet.AllTestClasses;
import com.VivaStreet.QRCodeHelper;
import com.google.zxing.NotFoundException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;

public class TestScreenCompare {

     @Test
   public void testOne() throws IOException, NotFoundException {
         String methName = Thread.currentThread().getStackTrace()[1].getMethodName();
         AllTestClasses.setChildDirectory(methName);

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.uk");

      AllTestClasses.takeScreenShot(driver,"Tests");

        // System.out.println( methName);
       driver.close();


    }

}