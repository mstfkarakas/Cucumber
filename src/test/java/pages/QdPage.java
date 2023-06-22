package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {

    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement homepageLoginButton;

    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement successfulLoginElement; // My Course is visible.

    @FindBy(id = "login-email")
    public WebElement emailBox;

    @FindBy(id = "login-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginPageLoginButton;


}
