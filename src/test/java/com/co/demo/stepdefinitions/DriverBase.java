package com.co.demo.stepdefinitions;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverBase {

    public static AppiumDriver driver;

    public static AppiumDriver initializeDriver() {
        if (driver == null) {
            String nodeURL = "http://localhost:8085";
            MutableCapabilities options = new MutableCapabilities();
            options.setCapability("platformName", "Android");
            options.setCapability("deviceName", "V2322");
            options.setCapability("platformVersion", "13");
            options.setCapability("appPackage", "com.example.misionticsemana1");
            options.setCapability("appActivity", "com.example.misionticsemana1.ejemploRelativeLayout");
            options.setCapability("noReset", "true");
            options.setCapability("autoGrantPermissions", "true");

            try {
                driver = new AppiumDriver(new URL(nodeURL), options);
               // driver.get("https://elenastepuro.github.io/test_env/index.html");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
        //appiumWrapper = new AndroidDriver<AndroidElement>(new URL(nodeURL), options);
        //appiumWrapper = DriverWrapper.wrap(appiumWrapper);

    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
