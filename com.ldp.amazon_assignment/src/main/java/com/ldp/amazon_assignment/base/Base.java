package com.ldp.amazon_assignment.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties properties;


    public WebDriver launchDriver() {
        propertyFile();
        String driverLoc = properties.getProperty("driverLocation");
        String browserName = properties.getProperty("browser");
        String url = properties.getProperty("url");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverLoc);
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        return driver;
    }

    public void tearDown(){
        driver.quit();
    }


    public Properties propertyFile() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/surenj/IdeaProjects/com.ldp.amazon_assignment/src/main/java/com/ldp/amazon_assignment/config/config.propertise");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}













