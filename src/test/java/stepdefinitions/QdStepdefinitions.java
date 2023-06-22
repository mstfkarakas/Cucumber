package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class QdStepdefinitions {

    QdPage qdpage = new QdPage();

    @Then("user clicks on qdHomepage login button")
    public void user_clicks_on_qd_homepage_login_button() {
        qdpage.homepageLoginButton.click();

    }
    @Then("user inputs a valid email to emailBox")
    public void user_inputs_a_valid_email_to_email_box() {
        qdpage.emailBox.sendKeys(ConfigReader.getProperty("qdValidUsername"));

    }
    @Then("user inputs a valid password to passwordBox")
    public void user_inputs_a_valid_password_to_password_box() {
        qdpage.passwordBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));

    }
    @Then("user clicks on loginPage login button")
    public void user_clicks_on_login_page_login_button() {
        qdpage.loginPageLoginButton.click();

    }
    @Then("test that user could login")
    public void test_that_user_could_login() {
        Assert.assertTrue(qdpage.successfulLoginElement.isDisplayed());

    }

    @Then("user inputs a valid {string} to emailBox")
    public void user_inputs_a_valid_to_email_box(String expectedUsername) {
        qdpage.emailBox.sendKeys(ConfigReader.getProperty(expectedUsername));

    }
    @Then("user inputs an invalid {string} to passwordBox")
    public void user_inputs_an_invalid_to_password_box(String expectedPassword) {
        qdpage.passwordBox.sendKeys(ConfigReader.getProperty(expectedPassword));

    }
    @Then("test that user could not login")
    public void test_that_user_could_not_login() {
        Assert.assertTrue(qdpage.emailBox.isDisplayed());


    }

    @Then("user inputs {string} to emailBox")
    public void userInputsToEmailBox(String emails) {
        qdpage.emailBox.sendKeys(emails);

    }

    @Then("user inputs {string} to passwordBox")
    public void user_inputs_to_password_box(String passwords) {
        qdpage.passwordBox.sendKeys(passwords);

    }


    @And("waitFor {int} seconds")
    public void waitforSeconds(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }
    }
}
