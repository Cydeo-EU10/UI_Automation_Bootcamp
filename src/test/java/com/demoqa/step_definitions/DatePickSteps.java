package com.demoqa.step_definitions;

import com.demoqa.pages.DatePickPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePickSteps {



    @When("click date-picker box")
    public void click_date_picker_box() {

    }

    @And("select any date data as {string} {string} {string}")
    public void select_Any_Date_Data_as(String month, String year, String day) {

    }

    @Then("verify selected correct date data")
    public void verify_selected_correct_date_data() {

    }

}
