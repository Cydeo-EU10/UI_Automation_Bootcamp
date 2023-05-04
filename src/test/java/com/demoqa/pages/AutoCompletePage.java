package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoCompletePage extends BasePage {

    @FindBy(id = "autoCompleteSingleInput")
    public WebElement autoCompleteSingleInput;

    @FindBy(css = ".auto-complete__option")
    public WebElement autoCompleteOption;

    @FindBy(id = "autoCompleteMultipleInput")
    public WebElement autoCompleteMultipleInput;

    //css-xb97g8 auto-complete__multi-value__remove
    @FindBy(xpath = "//div[@class='css-xb97g8 auto-complete__multi-value__remove']")
    public WebElement deleteSelected;

    ////*[@id="autoCompleteMultipleContainer"]/div/div[1]
    @FindBy(xpath = "//*[@id='autoCompleteMultipleContainer']/div/div[1]")
    public WebElement classAttrabiute;

    ///////////////////


    //////////////////////
    @FindBy(xpath = "//input[@type='range']")
    public WebElement sliderInput;

    @FindBy(xpath = "//input[@id='sliderValue']")
    public WebElement inputValue;

    ///////////////////
    @FindBy(id = "startStopButton")
    public WebElement startStopButton;

    @FindBy(xpath = "//div[@role='progressbar']")
    public WebElement progressBar;

    @FindBy(id = "resetButton")
    public WebElement resetButton;
    ////////////////////////

    public WebElement selectMenuType(String s){
        return Driver.getDriver().findElement(By.xpath("//a[text()='Main Item "+s+"']"));
    }
    /////////////////////////

    public WebElement selectTab(String tabName){
        return Driver.getDriver().findElement(By.id("demo-tab-"+tabName+""));
    }

    public boolean contains(String num,String text,String tabName){
        System.out.println("This tab "+num+"-"+tabName.toUpperCase()+ " contains : "+text);
        return  Driver.getDriver().findElement(By.xpath("(//p[@class='mt-3'])["+num+"]")).getText().contains(text);
    }


}
