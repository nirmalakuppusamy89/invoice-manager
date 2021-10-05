package com.gic.invoice_manager.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnsFilterPage extends BasePage {


    private static final Logger LOGGER = LoggerFactory.getLogger(AddInvoicePage.class);


    public ColumnsFilterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[3]/a")
    private WebElement productsMenuOption;

    @FindBy(xpath = "//*[@id=\"products_index\"]")
    private WebElement listProductSubMenu;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement productDisplayPage;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[5]/span")
    private WebElement columnsHeaderMenu;

    @FindBy(xpath = "/html/body/ul/li[1]/a")
    private WebElement idColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[2]/a")
    private WebElement nameColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[3]/a")
    private WebElement detailsColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[4]/a")
    private WebElement priceColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[5]/a")
    private WebElement taxRateColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[6]/a")
    private WebElement taxMethodColumnsOption;

    @FindBy(xpath = "/html/body/ul/li[7]/a")
    private WebElement actionsColumnsOption;


    public void goToListProductsPage(){

        LOGGER.info("User clicks products dropdown");
        productsMenuOption.click();
        LOGGER.info("User clicks add list products option");
        wait.forceWaitForTime(2);
        listProductSubMenu.click();

    }

    public void clicksColumns(){
        LOGGER.info("User clicks columns dropdown");
        columnsHeaderMenu.click();

    }

    public void clickColumnOptionAndVerify() {
        LOGGER.info("User clicks ID option from dropdown");
        idColumnsOption.click();
        wait.forceWaitForTime(3);
        verifyTheColumnsOptions("ID", "1");
        verifyTheColumnsOptions("Name", "2");
        verifyTheColumnsOptions("Details", "3");
        verifyTheColumnsOptions("Price", "4");
        verifyTheColumnsOptions("Tax Rate", "5");
        verifyTheColumnsOptions("Tax Method", "6");


    }

    public void verifyTheColumnsOptions(String expectedColumnName, String columnIndex){
        String columnNameText = driver.findElement(
                By.xpath("//*[@id=\"fileData\"]/thead/tr/th[" + columnIndex + "]")).getText();
        LOGGER.info("Asserting column " + expectedColumnName);
        Assert.assertEquals(expectedColumnName, columnNameText);

    }

}