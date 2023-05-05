package com.demoqa.step_definitions;

import com.demoqa.pages.SliderPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class SliderSteps {

    SliderPage sliderPage = new SliderPage();
    Actions actions = new Actions(Driver.getDriver());

    int sliderBarAfterValue;
    int sliderBarInitialValue;

    @When("make some slider actions to {string}")
    public void makeSomeSliderActionsTo(String input) {
        // before I do any increase or decrease action I should read the initial value

        if(input.equalsIgnoreCase("increase")){
            actions.dragAndDropBy(sliderPage.sliderInput, 20,0).perform();
        }else if(input.equalsIgnoreCase("decrease")){
            actions.dragAndDropBy(sliderPage.sliderInput, -20,0).perform();
        }else{
            System.out.println("wrong input");
        }

    }

    @Then("verify slider value {string}")
    public void verifySliderValue(String outcome) {

        sliderBarAfterValue = Integer.parseInt(sliderPage.inputValue.getAttribute("value"));
        System.out.println("from the slider bar itself : " + sliderPage.sliderInput.getAttribute("value") );
        if(outcome.equalsIgnoreCase("increased")){
            Assert.assertTrue(sliderBarAfterValue > sliderBarInitialValue);
        }else if(outcome.equalsIgnoreCase("decreased")){
            Assert.assertTrue(sliderBarAfterValue < sliderBarInitialValue);
        }else {
            System.out.println("wrong expectation");
        }

    }
}
