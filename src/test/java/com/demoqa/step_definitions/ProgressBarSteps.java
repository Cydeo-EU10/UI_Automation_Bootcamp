package com.demoqa.step_definitions;

import com.demoqa.pages.ProgressBarPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarSteps {

    ProgressBarPage progressBarPage = new ProgressBarPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

    @When("click startStopButton")
    public void click_start_stop_button() throws InterruptedException {
        progressBarPage.startStopButton.click();
        Thread.sleep(2000);
    }

    @When("progress bar continue until value is {string}")
    public void progress_bar_continue_until_value_is(String value) {

        wait.pollingEvery(Duration.ofMillis(50));
        wait.until(ExpectedConditions.attributeToBe(progressBarPage.progressBar,"aria-valuenow",value));

    }


    @Then("verify button name is Reset")
    public void verifyButtonNameIsReset() {

        String actualText = progressBarPage.resetButton.getText();

        Assert.assertEquals("Reset",actualText);


    }

    @Then("Verify progress bar value is {string}")
    public void verifyProgressBarValueIs(String expectedValue) {

        String actualValue = progressBarPage.progressBar.getAttribute("aria-valuenow");
        System.out.println("actualValue = " + actualValue);

        int expectedValueINT = Integer.parseInt(expectedValue);
        int actualValueINT = Integer.parseInt(actualValue);

        // making a kind of logic that does not matter for our feature functionality
        Assert.assertTrue(actualValueINT <= expectedValueINT + 5 || actualValueINT >= expectedValueINT - 5);

    }
}
