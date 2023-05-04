package com.demoqa.pages;

import com.demoqa.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


      public BasePage() {
            PageFactory.initElements(Driver.getDriver(), this);
      }


      public void scrollDown(){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollBy(0, 750)");
      }
}
