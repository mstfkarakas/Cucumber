package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HerOkuPage;
import utilities.ReusableMethods;

public class HerOkuAppStepDefinitions {
    HerOkuPage herOkuPage =new HerOkuPage();


    @Then("user clicks on addElement button")
    public void user_clicks_on_add_element_button() {
        herOkuPage.addElementButton.click();

    }
    @Then("user waits until delete button appears")
    public void user_waits_until_delete_button_appears() {
        ReusableMethods.waitForVisibility(By.xpath("//button[text()='Delete']"),400);

    }
    @Then("tests that delete button is visible")
    public void tests_that_delete_button_is_visible() {
        Assert.assertTrue(herOkuPage.deleteButton.isDisplayed());

    }
    @Then("deletes delete button by clicking delete button")
    public void deletes_delete_button_by_clicking_delete_button() {
        herOkuPage.deleteButton.click();

    }
    @Then("tests that delete button is not visible")
    public void tests_that_delete_button_is_not_visible() {
        try {

            /*
            We are trying to test something which is not there so normal ways will fail
            because to use isDisplayed() method first we need to locate the webElement
            But webElement is not there, so we can not locate it, and it means we can not use isDisplayed() method

            if we try to locate a webElement which is not there, system will throw an exception
            So we can use this exception with try-catch blocks

            if the web element is not there, it will throw an exception so test will pass
            because there is an assertion "Assert.assertTrue(true);" int catch block

            if it finds the element test will fail "Assert.assertTrue(false);"
             */

            herOkuPage.deleteButton.isDisplayed();
            Assert.assertTrue(false);
        } catch (Exception e) {
            Assert.assertTrue(true);
        }


    }

}
