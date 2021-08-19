package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", driverLoc);
            if(properties.getProperty("headless").equals("yes")){
                //headless mode:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
            }else{
                driver = new ChromeDriver();
            }
        } else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", driverLoc);
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.navigate().to(url);
        return driver;

    }

    public void tearDown(){
        driver.quit();
    }


    public Properties propertyFile() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/surenj/IdeaProjects/com.ldp.cucumber.practice1/src/test/java/config/config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}





