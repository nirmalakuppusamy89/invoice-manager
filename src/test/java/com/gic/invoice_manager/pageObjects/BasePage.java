package com.gic.invoice_manager.pageObjects;

import com.gic.invoice_manager.utils.SetUp;
import com.gic.invoice_manager.utils.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = SetUp.driver;
        this.wait = new Wait(this.driver);
    }
}
