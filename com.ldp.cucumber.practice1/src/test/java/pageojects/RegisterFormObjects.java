package pageojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterFormObjects {

    @FindBy(xpath = "//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")
    public static WebElement enterFirstName;

    @FindBy(xpath = "//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")
    public static WebElement enterLastName;

    @FindBy(xpath = "//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea")
    public static WebElement enterAddress;

    @FindBy(xpath = "//*[@id=\'eid\']/input")
    public static WebElement enterEmailId;

    @FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
    public static WebElement enterPhoneNumber;

    @FindBy(id = "Skills")
    public static WebElement selectSkill;

    @FindBy(id = "countries")
    public static WebElement selectCountry ;

    @FindBy(id = "yearbox")
    public static WebElement selectBirthYear;

    @FindBy(xpath = "//*[@id=\'basicBootstrapForm\']/div[11]/div[2]/select")
    public static WebElement selectBirthMonth;

    @FindBy(id = "daybox")
    public static WebElement selectBirthDate;

    @FindBy(id = "submitbtn")
    public static WebElement clickSubmit;
}
