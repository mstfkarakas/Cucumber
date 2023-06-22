package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class HowToGeBeautifulReportAutomationStepDefinitions {

        /*

    To get a beautiful report,first we need to open pom.xml file

    from plugins,
    we need to change 2 include tags for sure-fire and fail-safe plugins
    we should enter unique name for our runner there
    like
            /*
            <include>**///runners/*RunnerBR*.java</include>
            /*
            <include>**///runners/*RunnerBR*.java</include>
    /*
    we also need to change the numbers of browsers depending on how many we want to open
                <threadCount>1</threadCount>
     */

    AutomationPage automationPage = new AutomationPage();

    Faker faker = new Faker();
    String name;
    String lastName;
    String email;
    String password;
    Actions actions = new Actions(Driver.getDriver());

    @Given("clicks the user sign in link")
    public void clicks_the_user_sign_in_link() {

        automationPage.homePageSignUpButton.click();
    }
    @Given("user enters email address and a name")
    public void user_enters_email_address_and_a_name() {
        name = faker.name().firstName();
        email = faker.internet().emailAddress();

        automationPage.loginPageNameTextBox.sendKeys(name);
        automationPage.loginPageEmailTextBox.sendKeys(email);

    }
    @Given("clicks the SignUp button")
    public void clicks_the_sign_up_button() {
        automationPage.loginPageSignUpButton.click();

    }
    @Given("user enters personal and contact information")
    public void user_enters_personal_and_contact_information() {
        automationPage.informationPageGenderRadioButton.click();
        password = faker.internet().password();
        lastName = faker.name().lastName();
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("19")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(name)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)

                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("65468")          //.sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();

    }
    @Given("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {
        automationPage.informationPageCreateAccountButton.click();

     //   ReusableMethods.waitFor(50);   This is to see the Account Created! message during the test.

    }
    @Then("verify account creation")
    public void verify_account_creation() {
        automationPage.registeredUserMessage.isDisplayed();

    }

}
