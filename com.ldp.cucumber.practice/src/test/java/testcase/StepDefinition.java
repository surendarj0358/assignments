package testcase;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class StepDefinition extends Base {
    Base base ;

    @Given("open browser")
    public void open_browser() {
        base = new Base();
        base.launchDriver();
        base.propertyFile();
    }
    @When("enter url")
    public void enter_url() {
       driver.get(properties.getProperty("url"));
    }

    @Then("verify login page loaded or not")
    public void verify_login_page_loaded_or_not() {
    WebElement logo = driver.findElement(By.id("divLogo"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @When("enter username as {string}")
    public void enter_username(String username) {
       driver.findElement(By.id("txtUsername")).sendKeys(username);
    }
    @When("enter password as {string}")
    public void enter_password(String password) {
       driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    @When("click login button")
    public void click_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("verify login sucess or not")
    public void verify_login_sucess_or_not() {
     WebElement tab = driver.findElement(By.id("menu_pim_viewMyDetails"));
     Assert.assertTrue(tab.isDisplayed());
    }




}
