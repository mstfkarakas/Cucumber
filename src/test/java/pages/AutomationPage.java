package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement homePageSignUpButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement loginPageNameTextBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement loginPageEmailTextBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement loginPageSignUpButton;

    @FindBy(id = "id_gender1")
    public WebElement informationPageGenderRadioButton;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement informationPageCreateAccountButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement registeredUserMessage;




}
