package com.VivaStreet;

import org.apache.commons.io.FileUtils;
import org.apache.maven.shared.utils.io.DirectoryScanner;
import org.openqa.selenium.*;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Screener {


    static String filePath = System.getProperty("user.dir") + "/SeleniumScreenshots/";
    static ImageDiff imageDiff;
    static String childFolder = "folder";
    static String fullpath = filePath + childFolder;
    static DirectoryScanner scanner = new DirectoryScanner();

    public static void makeParentDirectory() throws IOException {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Directory created");
        } else {
            System.out.println("Directory exists");
        }
    }


    public static void makeChildDirectory() throws IOException {


        Path path = Paths.get(filePath + childFolder);
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Directory created");
        } else {
            System.out.println("Directory exists");
        }
    }


    public static void setChildDirectory(String folderName) {

        childFolder = folderName + "/";

    }

    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {

        makeParentDirectory();
        setChildDirectory(fileName);
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        boolean fileAvailable= Paths.get(filePath+childFolder+fileName+".png").toFile().exists();

        if (!fileAvailable) {
            FileUtils.copyFile(src, new File(filePath + childFolder, fileName + (".png")));
        }
        else if (fileAvailable)
               {
                    FileUtils.copyFile(src, new File(filePath + childFolder, fileName + ("new.png")));
                }

        if (!compareImages(fileName) == true) {

            System.out.println("The images are not the same check the comparison pic");
        }
    }


    public static boolean compareImages(String expectedFile) throws IOException {

        BufferedImage expectedImage = null;
        BufferedImage actualImage = null;
        scanner.setIncludes(new String[]{expectedFile, "**/*.png"});
        scanner.setBasedir(System.getProperty("user.dir"));
        scanner.setCaseSensitive(false);
        scanner.scan();
        String[] allFiles = scanner.getIncludedFiles();
        //File newFile = new File(System.getProperty("user.dir")+filePath+childFolder+expectedFile+".png");
       boolean fileAvailable= Paths.get(filePath+childFolder+expectedFile+"new.png").toFile().exists();

        if (allFiles.length==1) {
           // String filename = filePath + childFolder + expectedFile + ".png";

            expectedImage = ImageIO.read(new File(filePath + childFolder, expectedFile + (".png")));
            actualImage = ImageIO.read(new File(filePath + childFolder, expectedFile + (".png")));
        } else if (allFiles.length > 1 && !fileAvailable) {
            try {
                expectedImage = ImageIO.read(new File(filePath + childFolder, expectedFile + ".png"));
                actualImage = ImageIO.read(new File(filePath + childFolder, expectedFile + ".png"));
            } catch (IIOException e) {

                System.out.println("something went wrong");
                System.out.println(e.getMessage());
            }

        }
            else {

            try {
                expectedImage = ImageIO.read(new File(filePath + childFolder, expectedFile + ".png"));
                actualImage = ImageIO.read(new File(filePath + childFolder, expectedFile + "new.png"));
            } catch (IIOException e) {

                System.out.println("something went wrong");
                System.out.println(e.getMessage());
            }


            }



        ImageDiffer imageDiffer = new ImageDiffer();
        imageDiff = imageDiffer.makeDiff(expectedImage, actualImage);

        if (imageDiff.hasDiff())

        {
            ImageIO.write(imageDiff.getMarkedImage(), "PNG", new File(filePath + childFolder, (expectedFile + "ComparisonPic.png")));
            return false;

        } else {
            System.out.println("The image is fine..Nothing has changed");

            return true;
        }


    }

}




