package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

import java.security.Key;

public class EditorPageStepDefinitions {

    EditorPage editorPage = new EditorPage();


    @Then("user clicks on NEW button")
    public void user_clicks_on_new_button() {
        editorPage.editorHomePageNewButton.click();

    }
    @Then("user enters {string} to firstName box")
    public void user_enters_to_first_name_box(String firstName) {
        editorPage.firstNameTextBox.sendKeys(firstName);

    }
    @Then("user enters {string} to lastName box")
    public void user_enters_to_last_name_box(String lastName) {
        editorPage.lastNameTextBox.sendKeys(lastName);

    }
    @Then("user enters {string} to position box")
    public void user_enters_to_position_box(String position) {
        editorPage.positionTextBox.sendKeys(position);

    }
    @Then("user enters {string} to office box")
    public void user_enters_to_office_box(String office) {
        editorPage.officeTextBox.sendKeys(office);

    }
    @Then("user enters {string} to extension box")
    public void user_enters_to_extension_box(String extension) {
        editorPage.extensionTextBox.sendKeys(extension);

    }
    @Then("user enters {string} to startDate box")
    public void user_enters_to_start_date_box(String startDate) {
        editorPage.startDateTextBox.sendKeys(startDate);

    }
    @Then("user enters {string} to salary box")
    public void user_enters_to_salary_box(String salary) {
        editorPage.salaryTextBox.sendKeys(salary);

    }
    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        editorPage.createButton.click();

    }
    @Then("user sends the {string} to search box")
    public void user_sends_the_to_search_box(String firstName) {
        editorPage.searchTextBox.sendKeys(firstName + Keys.ENTER);

    }
    @Then("tests that user's {string} is in the list")
    public void tests_that_user_s_is_in_the_list(String firstName) {

        String actualSearch = editorPage.tableFirstNameElement.getText();
        String expectedSearch = firstName;  // no need for that, instead write firstName below

        Assert.assertTrue(actualSearch.contains(expectedSearch)); //write firstName here instead of expectedContent.

    }



}
