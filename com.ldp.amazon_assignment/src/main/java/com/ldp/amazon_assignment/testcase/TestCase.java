package com.ldp.amazon_assignment.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TestCase {

   @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/ul/li[3]/span/div[1]/a/div/img")
   public static WebElement clickThirdItemInTodaysDeal;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/ul/li[3]/span/div/div[1]/a/div")
    public static WebElement clickTheThirdItem;

    @FindBy(id= "quantity")
    public static WebElement selectQuantity;

//    @FindBy(xpath = "//*[@id=\'nav-xshop\']/a[2]")
//    public static WebElement clickTab;

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement searchMobiles;

    @FindBy(id = "nav-search-submit-button")
    public static WebElement clickSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[21]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
    public static WebElement clickLastItem;

    @FindBy(id = "nav-link-accountList")
    public static WebElement clickAccountSignIn;

    @FindBy(id = "ap_email")
    public static WebElement enterUserName;

    @FindBy(id="continue")
    public static WebElement clickCountinue;

    @FindBy(id = "ap_password")
    public static WebElement enterPassword;

    @FindBy(id = "signInSubmit")
    public static WebElement clickSignInButton;

    @FindBy(id = "nav-orders")
    public static WebElement clickMyOrders;

    @FindBy(id = "a-autoid-1-announce")
    public static WebElement selectDuration;

    @FindBy(id = "nav-link-accountList")
    public static WebElement clickAccountAndList;

    @FindBy(xpath = "//*[@id=\'a-page\']/div[2]/div/div[3]/div[2]/a/div")
    public static WebElement clickPaymentOptions;

    @FindBy(className = "a-expander-header")
    public static WebElement getCardDetails;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]")
    public static WebElement clickYourAddress;

    @FindBy(xpath = "//*[@id=\'ya-myab-address-add-link\']/div/div")
    public static WebElement clickAddAddress;

    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    public static WebElement enterFullName;

    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    public static WebElement enterPhoneNumber;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    public static WebElement enterPostalCode;

    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    public static WebElement enterAddressLine1;

    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    public static WebElement enterAddressLine2;

    @FindBy(id = "address-ui-widgets-enterAddressCity")
    public static WebElement enterCity;

    @FindBy(id = "address-ui-widgets-form-submit-button")
    public static WebElement clickAddNewAddress;

    @FindBy(xpath = "//*[@id=\'ya-myab-display-address-block-1\']/div/div/div/ul/li[2]")
    public static WebElement verifyNewlyCreatedAddress;











}
