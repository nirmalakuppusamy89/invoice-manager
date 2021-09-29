package com.gic.invoice_manager.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ListInvoicePage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    public ListInvoicePage() {
        PageFactory.initElements(driver, this);
    }

    private String selectedRowId;


    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement invoicesPage;

    @FindBy(id="status_chosen")
    private WebElement statusDropDown;

    @FindBy(xpath = "//*[@id=\"status_chosen\"]/div/ul/li[3]")
    private WebElement updateStatusDropDownValue;

    @FindBy(xpath = "//*[@type='submit' or @name='submit']")
    private WebElement updateInvoiceButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]")
    private WebElement invoiceUpdatedSuccessfulText;

    @FindBy(xpath = "//tr")
    private List <WebElement> actionRows;

    @FindBy(xpath = "/html/body/div[3]/div[2]")
    private WebElement accessDeniedAlert;


    public List<String> getActionIds() {
        LOGGER.info("User clicks action in the first row");
        List<String> actionIdList = new ArrayList<>();
        actionRows.forEach(actionRow -> actionIdList.add(actionRow.getAttribute("id")));
        return actionIdList;
    }

    public void editAndUpdateInvoices(){
        List<String> actionIds = getActionIds();
        selectedRowId = actionIds.get(1);
        String actionsXpath = "//*[@id=\"" + selectedRowId + "\"]/td[10]/div/div/button";
        driver.findElement(By.xpath(actionsXpath)).click();
        wait.forceWaitForTime(3);
        String editInvoiceXpath = "//*[@id=\"" + selectedRowId + "\"]/td[10]/div/div/ul/li[4]/a";
        driver.findElement(By.xpath(editInvoiceXpath)).click();
        wait.forceWaitForTime(3);
        LOGGER.info("User selects the dropdown");
        statusDropDown.click();
        wait.forceWaitForTime(2);
        LOGGER.info("User clicks status for update");
        updateStatusDropDownValue.click();

    }

    public void verifyUpdatedInvoice(){
        wait.forceWaitForTime(3);
        LOGGER.info("Verifying successfully updated invoice message displayed!");
        Assert.assertTrue(invoiceUpdatedSuccessfulText.isDisplayed());
        String updatedStatusXpath = "//*[@id=\"" + selectedRowId + "\"]/span";
        LOGGER.info("User verifying the updated status");
        Assert.assertEquals("Overdue", driver.findElement(By.xpath(updatedStatusXpath)).getText());

    }

    public void clickUpdateInvoiceButton(){
        LOGGER.info("User clicks Add invoice button");
        updateInvoiceButton.click();
        wait.forceWaitForTime(2);

    }

    public void deleteInvoice(){
        List<String> actionIds = getActionIds();
        selectedRowId = actionIds.get(1);
        String actionsXpath = "//*[@id=\"" + selectedRowId + "\"]/td[10]/div/div/button";
        driver.findElement(By.xpath(actionsXpath)).click();
        wait.forceWaitForTime(3);
        String deleteInvoiceXpath = "//*[@id=\"" + selectedRowId + "\"]/td[10]/div/div/ul/li[7]/a";
        driver.findElement(By.xpath(deleteInvoiceXpath)).click();
        wait.forceWaitForTime(3);
        driver.switchTo().alert().accept();
        wait.forceWaitForTime(3);


    }

    public void verifyDeletedInvoice(){

        LOGGER.info("Verifying access denied alert displayed!");
        Assert.assertTrue(accessDeniedAlert.isDisplayed());

    }
}