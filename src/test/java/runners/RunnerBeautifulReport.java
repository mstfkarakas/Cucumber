package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip" ,
        dryRun = false  // if false, it runs the tests as normal. if true, it won't open the driver, it finds the missing methods.
)

public class RunnerBeautifulReport {

    /*
    In cucumber framework, runner class will have nothing in its body
    It is like an xml file in the TestNG FrameWork
    we will use this runner class to execute test cases

    We will use two annotations in this runner class
        1) @RunWith(Cucumber.class) This annotation is the only reason we have JUnit dependency in our pom.xml file
        Thanks to this annotation we will be able to execute cucumber classes
        2) @CucumberOptions

            * features = we should paste the folder address where we created our features files
            * glue = here we should paste stepDefinitions folder address
                    note : sometimes the system will ask you to enter only the name of the package
                           if that happens glue should be like this "stepdefinitions"
            * tags : it is like the group names in TestNg framework. You need to enter the tags of the test cases
            you want to execute
            * dryRun: If we want to create methods for our method calls in feature files, instead of running all the
             tests, we can use this option. If we use "true" for this option, instead of running all classes, system will
            give us missing methods

            while dryRun: true option is being used and if there is no missing method, test result will be "Passed"



     */

}
