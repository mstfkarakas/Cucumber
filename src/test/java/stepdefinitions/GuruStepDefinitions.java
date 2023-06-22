package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string} prints all values in its column")
    public void prints_all_values_in_its_column(String columnName) {

        // We chose Company column for our test

        List<WebElement> listOfCompanyNames = guruPage.companyElementsList;

        for (WebElement eachCompany : listOfCompanyNames) {
            System.out.println(eachCompany.getText());
        }

    }


    @Then("test that {string} list has {string} name")
    public void testThatListHasName(String companyName, String expectedCompanyName) {

        List<WebElement> listOfCompanyNames = guruPage.companyElementsList;


        int flag = 0;
        for (WebElement each : listOfCompanyNames ) {

            if (each.getText().equals(expectedCompanyName)) {
                flag = 1;
                System.out.println("list has the " + expectedCompanyName);
            }

                Assert.assertTrue(false);
            }
    }

    @Then("test that {string} list has {string} name withReusableMethod")
    public void testThatListHasNameWithReusableMethod(String companyName, String desiredCompany) {

        List<String> companyNames = ReusableMethods.getElementsText(guruPage.companyElementsList);

        Assert.assertTrue(companyNames.contains(desiredCompany));

    }
}
