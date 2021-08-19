package hooks;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Hooks extends Base {
    @After(order = 1)
    public void takeScreenshotOnFailure(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File sourceImage = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("/home/surenj/IdeaProjects/com.ldp.cucumber.practice1/screenShots/sample.png");
            try {
                FileHandler.copy(sourceImage,destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    @After(order = 0)
    public void tearDown(){
        driver.quit();
    }


}
