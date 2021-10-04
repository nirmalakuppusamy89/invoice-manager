package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.AddCustomerPage;
import com.gic.invoice_manager.pageObjects.AddInvoicePage;
import com.gic.invoice_manager.pageObjects.ListInvoicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerSteps {

    private final AddCustomerPage addCustomerPage;


    public AddCustomerSteps() {
        this.addCustomerPage = new AddCustomerPage();
    }

    @When("I navigate to add customer page")
    public void iNavigateToAddCustomerPage() {

        AddInvoicePage addInvoicePage = new AddInvoicePage();
        addInvoicePage.redirectToHomePage();
        addCustomerPage.goToAddCustomerPage();
        addCustomerPage.verifyUserInAddCustomerPage();

    }

    @And("I enter all the required fields in add customer page")
    public void iEnterAllTheRequiredFieldsInAddCustomerPage() {
        addCustomerPage.fillsValidCustomerField();


    }

    @And("I click Add customer Button")
    public void iClickAddCustomerButton() {
        addCustomerPage.clickAddCustomerButton();


    }

    @Then("verify this page is not working error")
    public void verifyThisPageIsNotWorking() {
        addCustomerPage.verifyUserGetsErrorMessage();

    }

}
