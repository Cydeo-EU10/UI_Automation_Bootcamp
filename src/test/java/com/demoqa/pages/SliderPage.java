package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage{

    @FindBy(xpath = "//input[@type='range']")
    public WebElement sliderInput;

    @FindBy(xpath = "//input[@id='sliderValue']")
    public WebElement inputValue;

}
