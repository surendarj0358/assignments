package pageojects;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {

    @FindBy(id = "logo")
    public static WebElement logo;

    @FindBy(id = "email")
    public static WebElement enterTheEmail;

    @FindBy(id = "enterimg")
    public static WebElement clickLogin;

    @FindBy(xpath = "//*[@id=\'section\']/div/h2")
    public static WebElement getTitle;


}
