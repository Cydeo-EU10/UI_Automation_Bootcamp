package com.demoqa.step_definitions;

import com.demoqa.pages.AccordianPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccordianStepsDefs {

    public String baseUrl = ConfigurationReader.getProperty("baseUrl");
    AccordianPage accordianPage = new AccordianPage();

    @Given("Navigate to {string} page")
    public void navigate_to_page(String path) {
    //     Driver.getDriver()   ---> giving me a singlton driver object
        Driver.getDriver().get(baseUrl+path); // No HARD coded structure
    }
    @When("click {string} accordion")
    public void click_accordion(String number) throws InterruptedException {
       //  accordianPage.accordianTwo.click(); ---> this does not use parameter from feature
        accordianPage.selectAccordian(number).click();
        accordianPage.scrollDown();
        Thread.sleep(2000); // to observe the change in webPage not for testing purpose
    }



    @Then("verify class text is {string} for {string}")
    public void verifyClassTextIsFor(String stateOfAccordian, String number) {

    }
}
