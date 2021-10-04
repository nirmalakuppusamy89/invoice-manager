package com.gic.invoice_manager.pageObjects;

import com.gic.invoice_manager.steps.ExportInvoiceSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExportInvoicePage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    public ExportInvoicePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[2]/h2[1]")
    private WebElement invoiceManager;

    @FindBy(xpath = "//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]/b[1]")
    private WebElement salesDropdown;

    @FindBy(xpath = "/html/body/div[11]")
    public WebElement copyOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[2]/span")
    public WebElement excelOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[3]/span")
    public WebElement csvOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[4]/span")
    public WebElement pdfOption;

    @FindBy(xpath = "//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[5]/span")
    public WebElement columnsDropDown;

    public void exportInvoiceDifferentFormat() {

        LOGGER.info("User clicks copy option in list invoice page ");
        copyOption.click();
        LOGGER.info("User excel option in list invoice page");
        excelOption.click();
        LOGGER.info("User csv option in csv invoice page");
        csvOption.click();
        LOGGER.info("User pdf option in pdf invoice page ");
        pdfOption.click();

    }

    public void verifyDownloadedFiles() {


    }


}
