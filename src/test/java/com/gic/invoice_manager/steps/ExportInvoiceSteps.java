package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.AddInvoicePage;
import com.gic.invoice_manager.pageObjects.ListInvoicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExportInvoiceSteps {

    private final ListInvoicePage listInvoicePage;
    private final AddInvoicePage addInvoicePage;


    public ExportInvoiceSteps() {
        this.listInvoicePage = new ListInvoicePage();
        this.addInvoicePage = new AddInvoicePage();

    }


    @When("I navigates to list invoices page")
    public void iNavigatesToListInvoicesPage() {
    addInvoicePage.redirectToHomePage();
    listInvoicePage.goToListInvoicePage();
    listInvoicePage.verifyUserInListInvoicePage();

    }

    @And("I can download the table content in different formats")
    public void iCanDownloadTheTableContentInDifferentFormats() {


    }

    @Then("verify the downloaded files")
    public void verifyTheDownloadedFiles() {

    }
}
