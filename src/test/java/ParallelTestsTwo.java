import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class ParallelTestsTwo extends TestBase{







    @Test
    public void testingOne() throws IOException, InterruptedException {


        driver.get("https://thathrowdown.com");
        driver.findElement(By.linkText("Video")).click();


        Thread.sleep(6000);



    }
}
