package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/home/surenj/IdeaProjects/com.ldp.cucumber.practice1/src/test/java/featureFile/login.feature"},
        glue = {"stepDefinitions","hooks"},
        tags = "@login",
        monochrome = true,
        plugin = {"pretty",
                "html:reports/report.html",
                "json:reports/report.json",
                "junit:reports/report.xml"}


)
public class TestRunner  {



}
