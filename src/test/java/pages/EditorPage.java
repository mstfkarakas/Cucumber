package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement editorHomePageNewButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameTextBox;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameTextBox;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionTextBox;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeTextBox;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionTextBox;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDateTextBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryTextBox;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement tableFirstNameElement;


}
