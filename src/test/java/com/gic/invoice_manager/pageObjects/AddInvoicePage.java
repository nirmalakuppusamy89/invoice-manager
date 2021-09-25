package com.gic.invoice_manager.pageObjects;

import org.openqa.selenium.support.PageFactory;

public class AddInvoicePage extends BasePage {

    public AddInvoicePage() {
        PageFactory.initElements(driver, this);
    }
}
