package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordianPage extends BasePage {


    // if you were only testing the second one
    @FindBy(id = "section2Heading")  // can I pass here number 2 as a parameter?
    public WebElement accordianTwo;

    public WebElement selectAccordian(String number){
        String locator = "#section"+number+"Heading";
        return Driver.getDriver().findElement(By.cssSelector(locator));
    }

}

