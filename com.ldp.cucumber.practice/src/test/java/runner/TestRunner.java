package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"/home/surenj/IdeaProjects/com.ldp.cucumber.practice/src/test/java/feature/google.feature"} , glue = {"testcase"}, plugin = {"pretty",
        "html:reports/report.html",
        "json:reports/report.json",
        "junit:reports/report.xml"})



public class TestRunner {

}
