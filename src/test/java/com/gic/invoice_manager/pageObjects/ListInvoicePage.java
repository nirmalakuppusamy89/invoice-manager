package com.gic.invoice_manager.pageObjects;

import org.openqa.selenium.support.PageFactory;

public class ListInvoicePage extends BasePage {

    public ListInvoicePage() {
        PageFactory.initElements(driver, this);
    }
}
