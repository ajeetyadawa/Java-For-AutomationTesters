package singletonTest;

import overriding.WebDriver;

public class WebDriverSinglton {
    private static String WebDriver=null;
    private WebDriverSinglton(){

    }
    public static String WebDriverSingltonInstance(){
        if(( WebDriver==null)){
            WebDriver ="Chrome";
            return WebDriver;
        }
        else
            return WebDriver;
    }



}
