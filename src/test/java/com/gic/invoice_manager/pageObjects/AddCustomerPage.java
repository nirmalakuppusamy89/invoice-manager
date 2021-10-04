package com.gic.invoice_manager.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.RandomStringUtils;

public class AddCustomerPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddInvoicePage.class);

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[4]/a")
    private WebElement customersDropDown;

    @FindBy(xpath = "//*[@id=\"customers_add\"]")
    private WebElement addCustomerDropDownOption;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement addCustomerPageHeader;

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

    @FindBy(xpath = "//*[@id=\"main-message\"]/h1/span")
    private WebElement pageNotWorkingErrorMessage;




    public void goToAddCustomerPage(){
        LOGGER.info("User clicks customer drop");
        customersDropDown.click();
        LOGGER.info("User clicks add customer option");
        wait.forceWaitForTime(2);
        addCustomerDropDownOption.click();
    }

    public void verifyUserInAddCustomerPage(){

        LOGGER.info("User verify in add customer page");
        Assert.assertTrue(addCustomerPageHeader.isDisplayed());


    }


    public void fillsValidCustomerField() {


        LOGGER.info("User enters company name");
        String companyText = "company_" + RandomStringUtils.randomAlphabetic(10);
        companyName.sendKeys(companyText);
        LOGGER.info("User enters contact person");
        String contactPersonText = "contactPerson_" + RandomStringUtils.randomAlphabetic(10);
        contactPerson.sendKeys(contactPersonText);
        LOGGER.info("User enters email address");
        String emailAddressText = "emailAddress_" + RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        emailAddress.sendKeys(emailAddressText);
        LOGGER.info("User enters phone number");
        String phoneNumberText = "07" + RandomStringUtils.randomNumeric(9);
        phoneNumber.sendKeys(phoneNumberText);
        LOGGER.info("User enters address");
        String entersAddress = "address_" + RandomStringUtils.randomAlphabetic(10);
        address.sendKeys(entersAddress);
        LOGGER.info("User enters city");
        String cityName = "city_" + RandomStringUtils.randomAlphabetic(10);
        city.sendKeys(cityName);
        LOGGER.info("user enters county");
        String countyText = "county_" + RandomStringUtils.randomAlphabetic(10);
        county.sendKeys(countyText);
        LOGGER.info("User enters postcode");
        String enterPostcode =  RandomStringUtils.randomAlphabetic(7).toUpperCase();
        postCode.sendKeys(enterPostcode);
        LOGGER.info("User enters country name");
        String countryName = "country_" + RandomStringUtils.randomAlphabetic(10);
        country.sendKeys(countryName);
        wait.forceWaitForTime(3);


    }

    public void clickAddCustomerButton() {
        LOGGER.info("User clicks add customer button");
        addCustomerButton.click();
        wait.forceWaitForTime(3);

    }

    public void verifyUserGetsErrorMessage(){
        LOGGER.info("Verify user display error message");
        Assert.assertTrue(pageNotWorkingErrorMessage.isDisplayed());
        String pageNotWorkingText = pageNotWorkingErrorMessage.getText();
        LOGGER.info("Verifying page not working error");
        Assert.assertEquals("This page isn’t working", pageNotWorkingText);
    }
}

