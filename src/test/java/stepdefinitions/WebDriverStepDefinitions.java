package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebDriverPage;
import utilities.Driver;

import java.util.Set;

public class WebDriverStepDefinitions {

    WebDriverPage webDriverPage = new WebDriverPage();
    String firstPageHandleValue;


    @Given("Scroll down to {string}")
    public void scroll_down_to(String string) {
        // we do not need to scroll down to the webElement because it is in the screen when the page is opened
    }

    @Given("Click {string}")
    public void click(String string) {
        firstPageHandleValue = Driver.getDriver().getWindowHandle();
        webDriverPage.loginPortalButton.click();

    }

    @Then("Switch to other window")
    public void switch_to_other_window() {
        Set<String> allHandleValues = Driver.getDriver().getWindowHandles();
        String secondTabHandleValue = "";
        for (String eachHandleValue : allHandleValues) {
            if (!eachHandleValue.equals(firstPageHandleValue)) {
                secondTabHandleValue = eachHandleValue;
            }
        }
        Driver.getDriver().switchTo().window(secondTabHandleValue);
    }

    @Then("Write values in the {string} and {string} boxes")
    public void write_values_in_the_and_boxes(String userName, String password) {
        webDriverPage.loginPageUserNameTextBox.sendKeys(userName);
        webDriverPage.loginPageUserPasswordTextBox.sendKeys(password);
    }

    @Then("Press the login button")
    public void press_the_button() {
        webDriverPage.loginPageLoginButton.click();
    }

    @Then("Test that the popup text is {string}")
    public void test_that_the_popup_text_is(String message) {

        String actualAlertMessage = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertMessage = message;

        Assert.assertEquals(expectedAlertMessage,actualAlertMessage);

    }

    @Then("Close the Popup by saying Ok")
    public void close_the_popup_by_saying_ok() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Go back to the first page")
    public void go_back_to_the_first_page() {

        Driver.getDriver().switchTo().window(firstPageHandleValue);

    }

    @Then("Test that user is in the first page")
    public void test_that_user_is_in_the_first_page() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "WebDriverUniversity.com";

        Assert.assertEquals(expectedTitle,actualTitle);


    }

}
