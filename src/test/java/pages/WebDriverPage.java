package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverPage {

    public WebDriverPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy( xpath = "//h1[text()='LOGIN PORTAL' ]")
    public WebElement loginPortalButton;

    @FindBy (id = "text")
    public WebElement loginPageUserNameTextBox;

    @FindBy (id = "password")
    public WebElement loginPageUserPasswordTextBox;

    @FindBy ( id = "login-button")
    public WebElement loginPageLoginButton;




}
