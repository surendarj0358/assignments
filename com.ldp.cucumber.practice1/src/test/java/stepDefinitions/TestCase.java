package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import pageojects.LoginObject;
import pageojects.RegisterFormObjects;
import utils.Utill;

import java.util.List;

public class TestCase extends Base{
    Base base;
    @Given("open browser")
    public void open_browser() {

        base = new Base();
        base.launchDriver();
        base.propertyFile();

    }

    @When("enter url")
    public void enter_url(){

        driver.get(properties.getProperty("url"));
    }

    @Then("verify login page loaded or not")
    public void verify_login_page_loaded_or_not() {
        PageFactory.initElements(driver, LoginObject.class);
        Assert.assertTrue(LoginObject.logo.isDisplayed());
    }

    @When("enter mail id as {string}")
    public void enter_mail_id(String emailid) {
        PageFactory.initElements(driver, LoginObject.class);
        LoginObject.enterTheEmail.sendKeys(emailid);

        }

    @Then("click login")
    public void click_login() {
        PageFactory.initElements(driver, LoginObject.class);
        LoginObject.clickLogin.click();

    }

    @Then("verify registeration form page loaded or not")
    public void verify_registeration_form_page_loaded_or_not() {

        PageFactory.initElements(driver, LoginObject.class);
        Assert.assertEquals(LoginObject.getTitle.getText(), Utill.EXPECTED_TITLE);

    }

    @Then("fill the registration form")
    public void fill_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> datas = dataTable.asLists();
        for (int i = 0;i<datas.size();i++){

            PageFactory.initElements(driver, RegisterFormObjects.class);
            RegisterFormObjects.enterFirstName.clear();
            RegisterFormObjects.enterLastName.clear();
            RegisterFormObjects.enterAddress.clear();
            RegisterFormObjects.enterEmailId.clear();
            RegisterFormObjects.enterPhoneNumber.clear();

            RegisterFormObjects.enterFirstName.sendKeys(datas.get(i).get(0));
            RegisterFormObjects.enterLastName.sendKeys(datas.get(i).get(1));
            RegisterFormObjects.enterAddress.sendKeys(datas.get(i).get(2));
            RegisterFormObjects.enterEmailId.sendKeys(datas.get(i).get(3));
            RegisterFormObjects.enterPhoneNumber.sendKeys(datas.get(i).get(4));
            RegisterFormObjects.selectSkill.sendKeys(datas.get(i).get(5));
            RegisterFormObjects.selectCountry.sendKeys(datas.get(i).get(6));
            RegisterFormObjects.selectBirthYear.sendKeys(datas.get(i).get(7));
            RegisterFormObjects.selectBirthMonth.sendKeys(datas.get(i).get(8));
            RegisterFormObjects.selectBirthYear.sendKeys(datas.get(i).get(9));
            RegisterFormObjects.clickSubmit.click();

        }



    }


}
