package com.toolsqa.automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpecialMethods {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Properties properties;

    public static void confiProperties(){
        properties = new Properties();
        try {
            properties.load(new FileReader("conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
