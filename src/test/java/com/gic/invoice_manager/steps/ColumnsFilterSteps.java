package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.AddInvoicePage;
import com.gic.invoice_manager.pageObjects.ColumnsFilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ColumnsFilterSteps {

    private final ColumnsFilterPage columnsFilterPage;

    public ColumnsFilterSteps() {
        this.columnsFilterPage = new ColumnsFilterPage();
    }

    @When("I navigates to list products page")
    public void iNavigatesToListProductsPage() {
        AddInvoicePage addInvoicePage = new AddInvoicePage();
        addInvoicePage.redirectToHomePage();
        columnsFilterPage.goToListProductsPage();


    }

    @And("I select a column option and verify in the table")
    public void iSelectAColumnOptionAndVerifyInTheTable() {
        columnsFilterPage.clicksColumns();
        columnsFilterPage.clickColumnOptionAndVerify();

    }

    @Then("I select {string} column option and verify in the table")
    public void iSelectNameColumnOptionAndVerifyInTheTable(String columnName) {
        columnsFilterPage.clicksColumns();

        switch (columnName) {
            case "Name":
                columnsFilterPage.clickNameOptionAndVerify();
                break;
            case "Details":
                columnsFilterPage.clickDetailsOptionAndVerify();
                break;
            case "Price":
                columnsFilterPage.clickPriceOptionAndVerify();
                break;
            case "Tax Rate":
                 columnsFilterPage.clickTaxRateOptionAndVerify();
                 break;
            case "Tax Method":
                  columnsFilterPage.clickTaxMethodOptionAndVerify();
                  break;
            case "Actions":
                  columnsFilterPage.clickActionsOptionAndVerify();
                  break;


        }


    }

}
