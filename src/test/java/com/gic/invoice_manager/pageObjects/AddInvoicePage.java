package com.gic.invoice_manager.pageObjects;

import com.gic.invoice_manager.utils.InvoiceConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.cert.X509Certificate;

public class AddInvoicePage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddInvoicePage.class);

    public AddInvoicePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[2]/h2[1]")
    private WebElement invoiceManager;

    @FindBy(xpath = "//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]/b[1]")
    private WebElement salesDropdown;

    @FindBy(xpath = "//*[@id=\"billing_company_chosen\"]/a/span")
    private WebElement billingCompany;

    @FindBy(id = "reference_no")
    private WebElement referenceNo;

    @FindBy(xpath = "//*[@id=\"gen_ref\"]/i")
    private WebElement generateRandomReferenceNumber;

    @FindBy(xpath = "//*[@id=\"customer_chosen\"]")
    private WebElement selectCustomerDropDown;

    @FindBy(xpath = "//*[@id=\"customer_chosen\"]/div/ul/li[4]")
    private WebElement customerToSelect;

    @FindBy(id = "due_date")
    private WebElement dueDate;

    @FindBy(id = "shipping")
    private WebElement shipping;

    @FindBy(id = "order_discount")
    private WebElement orderDiscount;

    @FindBy(id = "order_tax_chosen")
    private WebElement orderTaxDropDown;

    @FindBy(xpath = "//*[@id=\"order_tax_chosen\"]/div/ul/li[2]")
    private WebElement orderTaxToSelect;

    @FindBy(id="status_chosen")
    private WebElement statusDropDown;

    @FindBy(xpath = "//*[@id=\"status_chosen\"]/div/ul/li[4]")
    private WebElement statusToSelect;

    @FindBy(id = "recurring_chosen")
    private WebElement recurringDropDown;

    @FindBy(xpath = "//*[@id=\"recurring_chosen\"]/div/ul/li[1]")
    private WebElement recurringToSelect;

    @FindBy(id = "quantity-1")
    private WebElement quantity;

    @FindBy(id = "product-1")
    private WebElement productDescriptions;

    @FindBy(id = "price-1")
    private WebElement unitPrice;

    @FindBy(id = "subtotal-1")
    private WebElement subTotal;


    @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/form/div[11]/textarea")
    private WebElement textNoteField;


    @FindBy(xpath = "//*[@type='submit' or @name='submit']")
    private WebElement addInvoiceButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/button")
    private WebElement invoiceAddedSuccessfulText;

    @FindBy(xpath = "/html/body/div[2]/div/nav/ul/li[2]/a")
    private WebElement salesMenu;

    @FindBy(xpath = "//*[@id=\"sales_add\"]")
    private WebElement addInvoiceLink;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement addSale;



    public void goToAddInvoicePage(){
        LOGGER.info("User clicks sales menu");
        salesMenu.click();
        LOGGER.info("User clicks add invoice link");
        wait.forceWaitForTime(2);
        addInvoiceLink.click();
    }

    public void verifyUserInAddSalesPage(){

        LOGGER.info("Verifying user in add sales page");
        Assert.assertTrue(addSale.isDisplayed());
    }

    public void redirectToHomePage(){

        LOGGER.info("Opening home page url");
        driver.get(InvoiceConstants.APPLICATION_URL + InvoiceConstants.HOME_ENDPOINT);


    }

    public void fillAddSaleFields(){
        LOGGER.info("User Generate reference number");
        generateRandomReferenceNumber.click();
        wait.forceWaitForTime(2);
        LOGGER.info("User clicks dropdown");
        selectCustomerDropDown.click();
        wait.forceWaitForTime(2);
        LOGGER.info("User selects dropdown option");
        customerToSelect.click();
        wait.forceWaitForTime(2);
        LOGGER.info("User clicks shipping");
        String shippingText = "shipping_" + RandomStringUtils.randomAlphabetic(10);
        shipping.sendKeys(shippingText);
        LOGGER.info("User enters order discount");
        String orderDiscountNumber = RandomStringUtils.randomNumeric(2);
        orderDiscount.sendKeys(orderDiscountNumber);
        LOGGER.info("User clicks order tax dropdown");
        orderTaxDropDown.click();
        LOGGER.info("User selects tax dropdown ");
        orderTaxToSelect.click();
        LOGGER.info("User clicks status dropdown");
        statusDropDown.click();
        LOGGER.info("User selects status dropdown");
        statusToSelect.click();
        LOGGER.info("User clicks recurring drop down");
        recurringDropDown.click();
        LOGGER.info("User selects recurring");
        recurringToSelect.click();
        LOGGER.info("User enters quantity number");
        String quantityNumber = RandomStringUtils.randomNumeric(2);
        quantity.sendKeys(quantityNumber);
        LOGGER.info("User enters product description");
        String productDescriptionText = "productDescription_" + RandomStringUtils.randomAlphabetic(10);
        productDescriptions.sendKeys(productDescriptionText);
        LOGGER.info("User enters unit price");
        String unitPriceNumber = RandomStringUtils.randomNumeric(5);
        unitPrice.sendKeys(unitPriceNumber);
        LOGGER.info("User enters add note");
        String addNotesText = "addNotesText_" + RandomStringUtils.randomAlphabetic(50);
        textNoteField.sendKeys(addNotesText);



    }
    public void clickAddInvoiceButton() {
        LOGGER.info("User clicks add invoice button");
        addInvoiceButton.click();

    }

    public void verifyCreatedInvoice(){

        wait.forceWaitForTime(3);
        LOGGER.info("Verifying successfully invoice created in message displayed!");
        Assert.assertTrue(invoiceAddedSuccessfulText.isDisplayed());

    }
}
