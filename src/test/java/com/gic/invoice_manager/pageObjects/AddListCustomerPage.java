package com.gic.invoice_manager.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddListCustomerPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddInvoicePage.class);

    public AddListCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a")
    private WebElement cutomersDropDown;

    @FindBy(xpath = "//*[@id=\"customers_add\"]")
    private WebElement addCustomerDropDownOption;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement addCustomerPageDisplay;

    @FindBy(xpath = "//*[@id=\"company\"]")
    private WebElement companyName;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement contactPerson;

    @FindBy(xpath = "//*[@id=\"email_address\"]")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement address;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;

    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement county;

    @FindBy(xpath = "//*[@id=\"postal_code\"]")
    private WebElement postCode;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;

    @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div/input")
    private WebElement addCustomerButton;




}
