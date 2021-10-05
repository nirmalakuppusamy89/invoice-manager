package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.AddCustomerPage;
import com.gic.invoice_manager.pageObjects.AddInvoicePage;
import com.gic.invoice_manager.pageObjects.ColumnsFilterPage;
import com.gic.invoice_manager.pageObjects.LoginPage;
import io.cucumber.java.en.When;

public class ColumnsFilterSteps {

    private final ColumnsFilterPage columnsFilterPage;

    public ColumnsFilterSteps() {
        this.columnsFilterPage = new ColumnsFilterPage();
    }

    @When("I navigates to list customer page")
    public void iNavigatesToListCustomerPage() {
        AddInvoicePage addInvoicePage = new AddInvoicePage();
        addInvoicePage.redirectToHomePage();


    }







}
