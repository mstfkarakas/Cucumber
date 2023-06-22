package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {
    AmazonPage amazonPage = new AmazonPage();  // created at class level so that can be used in any method below.
                 /*
                sometimes we may need to create an object in all the methods it is used
                 */

    @Given("User goes to Amazon Homepage")
    public void user_goes_to_amazon_homepage() {
        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @Then("user searches for Nutella in the search box")
    public void user_searches_for_nutella_in_the_search_box() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("tests that result text contains Nutella")
    public void tests_that_result_text_contains_nutella() {
        amazonPage = new AmazonPage();
        String expectedContent = "Nutella";
        String actualContent = amazonPage.amazonSearchResult.getText();
        Assert.assertTrue(actualContent.contains(expectedContent));

    }
    @Then("closes the page")
    public void closes_the_page() {
        amazonPage = new AmazonPage();

        Driver.closeDriver();
    }

    @Then("user searches for TeaPot in search box")
    public void user_searches_for_tea_pot_in_search_box() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("TeaPot" + Keys.ENTER);
    }

    @Then("tests that the result contains TeaPot word")
    public void tests_that_the_result_contains_tea_pot_word() {
        amazonPage = new AmazonPage();
        String expectedContent = "TeaPot";
        String actualContent = amazonPage.amazonSearchResult.getText();

        Assert.assertTrue(actualContent.contains(expectedContent));
    }

    @Given("user searches for Flower in the search box")
    public void user_searches_for_flower_in_the_search_box() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Flower" + Keys.ENTER);
    }
    @Given("tests that the result contains Flower word")
    public void tests_that_the_result_contains_flower_word() {
        amazonPage = new AmazonPage();
        String expectedContent = "Flower";
        String actualContent = amazonPage.amazonSearchResult.getText();

        Assert.assertTrue(actualContent.contains(expectedContent));


    }

    @Then("user searches for {string} in the search box")
    public void userSearchesForInTheSearchBox(String word) {
        amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys(word + Keys.ENTER);
    }

    @And("tests that result text contains {string}")
    public void testsThatResultTextContains(String word) {
        amazonPage = new AmazonPage();

        String expectedWord = word;
        String actualContent = amazonPage.amazonSearchResult.getText();
        Assert.assertTrue(actualContent.contains(expectedWord));

    }

    @Given("User goes to {string} Homepage")
    public void userGoesToHomepage(String expectedURL) {
        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty(expectedURL));
    }

    @Then("tests that the URL has {string} word")
    public void testsThatTheURLHasWord(String URLWord) {
        amazonPage = new AmazonPage();
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedWord = URLWord;
        Assert.assertTrue(actualURL.contains(expectedWord));
    }

    @Then("user searches for {string} in the Amazon search box")
    public void user_searches_for_in_the_amazon_search_box(String contentToSearch) {
        amazonPage.amazonSearchBox.sendKeys(contentToSearch + Keys.ENTER);

    }
    @Then("tests that result text contains {string} word")
    public void tests_that_result_text_contains_word(String expectedWord) {
        String actualContent = amazonPage.amazonSearchResult.getText();
        Assert.assertTrue(actualContent.contains(expectedWord));


    }

}
