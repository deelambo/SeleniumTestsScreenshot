package com.VivaStreet;

import org.openqa.selenium.WebDriver;

public class UserFactory{

static WebDriver driver;

public  static User basicUser(){

    User basicUser = new User();

    basicUser.setEmail("pareesh@yahoo.com");
    basicUser.setAddress("12 Nairobi road");
    basicUser.setUsername("John Bosco");

    AdPostItem adPostItem= new AdPostItem();
    adPostItem.Description="kings";
    adPostItem.Item="tulips";

    basicUser.setAdPostItem(adPostItem);

  return  basicUser;
}


   public  static  User ProUser(){

    User ProUser = basicUser();
    ProUser.adPostItem.Item="links";
    ProUser.setCategories(Categories.cars);
    ProUser.setAddress("hyde park");
    ProUser.setCompany("One Hyde Park Knightsbridge");

    return ProUser;

}



}
