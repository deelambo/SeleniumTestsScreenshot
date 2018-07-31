package com.VivaStreet;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
//import sun.jvm.hotspot.utilities.Assert;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringJoiner;

import static org.mockito.Mockito.mock;

public class Main {

    public static void main(String[] args) throws IOException, AWTException {
	// write your code here
        //System.out.println(System.getProperty("file.separator"));

    WebDriver driver = new ChromeDriver();
      driver.get("https://google.com");

        java.awt.Robot robot = new java.awt.Robot();
               robot.keyPress(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_SHIFT);
               robot.keyPress(KeyEvent.VK_C);
              // robot.keyPress(KeyEvent.VK_COMMAND);
       // robot.keyRelease(KeyEvent.VK_F12);
//        Actions action = new Actions(driver) ;
//        action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).sendKeys("c").build().perform();
//        action.keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).build().perform();



      //  AdPostItem mocked = mock(AdPostItem.class);

//        UserFactory user = new Us®erFactory();
      //  User user1 = new User();
     //   AdPostItem adPostItem = new AdPostItem();


//        ArrayList names = new ArrayList();
//        names.add("data");
//        names.add(10);
//        names.add('j');
//
//       ArrayList<Integer> numbers = new ArrayList<>();
//
//       numbers.add(1);
//       numbers.add(1);
//       numbers.add(1);
//
//        numbers.forEach(p -> System.out.println(p.toString()));

//
//        StringJoiner stringJoiner = new StringJoiner("|","|","|");
//
//        stringJoiner.add("daily");
//        stringJoiner.add("early");
//        stringJoiner.add("all day");
//        stringJoiner.add("everyday");
//
//        System.out.println(stringJoiner.toString());

//
//          WebDriver driver = new ChromeDriver();
//        AdPostItem adPostItem = new AdPostItem();
//        System.out.println(adPostItem.huhMethod());
//     adPostItem.directoryName();
//     adPostItem.directoryName();

          // AllTestClasses.compareImages(driver);



//        driver.quit();
      //    AdPostItem.setChildDirectory("test folder");
    //   adPostItem.takeScreenshot(driver,"google homepage");

//          File file= new File(System.getProperty("user.dir")+"/pow");
          //file.mkdir();
        // driver.close();
//
//        System.out.println(AdPostItem.filePath);
//        AdPostItem.takeScreenshot("googletest");
//      WebElement myAccount= (WebElement) driver.findElements(By.xpath("//a[contains(.,'My Account')]"));
//        BufferedImage  expectedImage= ImageIO.read(new File(System.getProperty(AdPostItem.filePath)));
//        Screenshot screenshot = new AShot().takeScreenshot(driver,myAccount);
//        BufferedImage actualImage= screenshot.getImage();
//
//        ImageDiffer imgDiff = new ImageDiffer();
//        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
//        //Assert.(diff.hasDiff(),"Images are Same");
//        driver.quit();
//
//       driver.close();


//        Class c = AdPostItem.class;
//        Method[] m = c.getDeclaredMethods();
//        for (int i = 0; i < m.length; i++)
//            System.out.println(m[i].toString());

        }

//        System.out.println(UserFactory.basicUser().adPostItem.Description);
//
//        System.out.println(UserFactory.ProUser().adPostItem.Item);
//        System.out.println(UserFactory.ProUser().company);
//
//        System.out.println(UserFactory.basicUser().adPostItem.Item);
//        System.out.println(UserFactory.basicUser().username);
//
//
//        Calendar now = new GregorianCalendar();
//
//       String newTime = now.getTime().toString();
//
//
//        System.out.println(newTime.replace(" ","").replace(":","").replace("BST",""));




    }

