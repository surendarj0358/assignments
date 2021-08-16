package com.ldp.amazon_assignment.test;

import com.ldp.amazon_assignment.base.Base;
import com.ldp.amazon_assignment.testcase.TestCase;
import com.ldp.amazon_assignment.utill.TestUtill;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class AmazonTest extends Base {
    JavascriptExecutor scroll;
    Select select;
    Base base;

    @BeforeSuite
    public  void amazon(){
        base = new Base();
        base.launchDriver();
        base.propertyFile();
    }

    @AfterSuite
    public  void tearDown(){
        base.tearDown();
    }

        @Test(priority = 0)
        public void todaysDeal() throws IOException {

            scroll = (JavascriptExecutor)driver;
            scroll.executeScript(TestUtill.SCROLL_DOWN_TO_TODAY_DEAL,"");
            PageFactory.initElements(driver, TestCase.class);
            TestCase.clickThirdItemInTodaysDeal.click();
            TestCase.clickTheThirdItem.click();
            select = new Select(TestCase.selectQuantity);
            select.selectByValue("2");
            Assert.assertEquals(TestCase.selectQuantity.getAttribute("value"),TestUtill.EXPECTED_QUANTITY);
            driver.navigate().back();
            driver.navigate().back();
            scroll.executeScript(TestUtill.SCROLL_UP,"");

        }
        @Test(priority = 1)
        public void searchMobiles(){

            PageFactory.initElements(driver, TestCase.class);
            TestCase.searchMobiles.sendKeys((TestUtill.SEARCH_WORD));
            TestCase.clickSearch.click();
            scroll = (JavascriptExecutor)driver;
            scroll.executeScript(TestUtill.SCROLL_DOWN_TO_LAST_MOBILE,"");
            TestCase.clickLastItem.click();
            System.out.println(TestCase.clickLastItem.getAttribute("Info"));
            driver.navigate().back();

        }
        @Test(priority = 2)
        public void loginAmazon(){

            PageFactory.initElements(driver, TestCase.class);
            TestCase.clickAccountAndList.click();
            TestCase.enterUserName.sendKeys(properties.getProperty("email"));
            TestCase.clickCountinue.click();
            TestCase.enterPassword.sendKeys(properties.getProperty("password"));
            TestCase.clickSignInButton.click();

        }

        @Test(priority = 3)
        public void myOrder(){

            PageFactory.initElements(driver, TestCase.class);
            TestCase.clickMyOrders.click();
            TestCase.selectDuration.click();

        }

        @Test(priority = 4)
    public void cardDetails(){

            PageFactory.initElements(driver, TestCase.class);
            TestCase.clickAccountAndList.click();
            TestCase.clickPaymentOptions.click();
            Assert.assertTrue(TestCase.getCardDetails.getText().contains(TestUtill.EXPECTED_CARD_DETAIL));

        }

        @Test(priority = 5)
    public void deliveryAddress(){

            PageFactory.initElements(driver, TestCase.class);
            driver.navigate().back();
            TestCase.clickYourAddress.click();
            TestCase.clickAddAddress.click();

            scroll = (JavascriptExecutor)driver;
            scroll.executeScript(TestUtill.SCROLL_DOWN,"");
            TestCase.enterFullName.sendKeys(TestUtill.FULL_NAME);
            TestCase.enterPhoneNumber.sendKeys(TestUtill.MOBILE_NO);
            TestCase.enterPostalCode.sendKeys(TestUtill.PIN_CODE);
            TestCase.enterAddressLine1.sendKeys(TestUtill.ADDRESS_LINE1);
            TestCase.enterAddressLine2.sendKeys(TestUtill.ADDRESS_LINE2);
            TestCase.enterCity.sendKeys(TestUtill.CITY);
            TestCase.clickAddNewAddress.click();
            Assert.assertEquals(TestCase.verifyNewlyCreatedAddress.getText(),(TestUtill.ADDRESS_LINE1));

        }
    }





