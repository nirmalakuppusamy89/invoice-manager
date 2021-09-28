package com.gic.invoice_manager.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListInvoicePage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    public ListInvoicePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//body/div[3]/div[2]/h2[1]")
    private WebElement invoiceManager;

    @FindBy(xpath = "/html/body/div[3]/div[2]/h2")
    private WebElement invoicesPage;

    @FindBy(xpath = "//*[@id=\"224\"]/td[10]/div/div/button")
    private WebElement actionsDropDown;

    @FindBy(xpath = "//*[@id=\"224\"]/td[10]/div/div/ul/li[4]/a")
    private WebElement editOption;

    @FindBy(xpath = "//*[@id=\"224\"]/td[10]/div/div/ul/li[7]/a")
    private WebElement deleteOption;

    public void editAndUpdateInvoices(){


    }
    public void deleteInvoice(){


    }
    public void verifyTheInvoice(){


    }


}
