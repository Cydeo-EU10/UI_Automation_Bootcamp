package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage extends BasePage{
    @FindBy(id = "startStopButton")
    public WebElement startStopButton;

    @FindBy(xpath = "//div[@role='progressbar']")
    public WebElement progressBar;

    @FindBy(id = "resetButton")
    public WebElement resetButton;
}
