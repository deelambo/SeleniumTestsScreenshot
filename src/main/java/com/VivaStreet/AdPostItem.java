package com.VivaStreet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class AdPostItem {

     static WebDriver driver ;

    public String Description;
    public String Item;
    public Categories categories;

    static  String filePath = System.getProperty("user.dir")+"/images/";
    static String childFolder = "folder";

    public  static  String childPath(String fileName){

        return  filePath+fileName;
    }

    public static AdPostItem forName(String s) {

        return  null;
    }
    public void tester(){}

    public  void braveHeart(){}


    public static void makeDirectory() throws IOException {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Directory created");
        } else {
            System.out.println("Directory exists");
        }
    }


    public  static  void setChildDirectory(String folderName){

        childFolder=folderName;

    }
    public String huhMethod(){

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();

     return methodName;

    }
    public  static void takeScreenshot(WebDriver driver,String fileName) throws IOException {
        makeDirectory();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date newDate = new Date();
       File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(filePath+childFolder,fileName+dateFormat.format(newDate).replace(" ","").concat(".jpg")));
    }
    public static void allMethods() throws ClassNotFoundException {

        Method m[]= Class.forName("AdPostItem").getDeclaredMethods();

        //         for (int i = 0; i < methods.length; i++) {
//               filePath = System.getProperty("user.dir") + "/" + methods[i].getName();

        for (Method methods:m ) {

            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
            Date newDate = new Date();
            System.out.println(m.toString());
        }
    }

//    public  String directoryName() {
//        int counter = 0;
//        StringBuilder builder =new StringBuilder();
//        for (int i =0;i<this.classes.length;i++){
//        String dName = this.classes[i].getClass().getName();
//             builder = new StringBuilder(dName);
//
//        }
//
//        for (int i = 0; i < classes.length; i++) {
//
//
//
//                if (this.classes.getClass().getName() == this.classes[i].getClass().getName()) {
//                    String built = builder.replace(0, 15, " ").toString();
//                    System.out.println(built + counter);
//
//                }
//                counter++;
//
//
//        }
//       return builder.toString() + counter;
//
//    }


    public String getTestClassName(String testName) {
        String[] reqTestClassname = testName.split("\\.");
        int i = reqTestClassname.length - 1;
        System.out.println("Required Test Name : " + reqTestClassname[i]);
        return reqTestClassname[i];
    }

//
//    public void takeScreenshot(){
//
//        File file = new File("ScreenshotsResults");
//        if (!file.exists()) {
//            System.out.println("File created " + file);
//            file.mkdir();
//        }
//    }




}
