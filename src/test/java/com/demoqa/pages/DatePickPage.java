package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickPage extends BasePage{
    @FindBy(id = "datePickerMonthYearInput")
    public WebElement inputDataPicker;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement selectMonth;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement selectYear;

    @FindBy(className = "react-datepicker__day")
    public WebElement selectDay;
}
