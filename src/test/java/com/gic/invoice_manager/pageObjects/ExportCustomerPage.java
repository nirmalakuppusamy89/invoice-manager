package com.gic.invoice_manager.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExportCustomerPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    public ExportCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a")
    private WebElement customersDropDown;

    @FindBy(xpath = "//*[@id=\"customers_index\"]")
    private WebElement listCustomerSubMenu;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement listCustomerDisplay;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[1]/span")
    private WebElement copyOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[2]/span")
    private WebElement excelOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[3]/span")
    private WebElement csvOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[4]/span")
    private WebElement pdfOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[5]/span")
    private WebElement columnsOption;

    public void goToListCustomerPage(){


    }


}
