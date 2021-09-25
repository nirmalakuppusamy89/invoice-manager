package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.AddInvoicePage;
import com.gic.invoice_manager.pageObjects.ListInvoicePage;
import com.gic.invoice_manager.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageInvoiceSteps {

    private final AddInvoicePage addInvoicePage;
    private final ListInvoicePage listInvoicePage;

    public ManageInvoiceSteps() {
        this.addInvoicePage = new AddInvoicePage();
        this.listInvoicePage = new ListInvoicePage();

    }

    @Given("I'm logged in as a admin user to invoice manager")
    public void i_m_logged_as_a_admin_user_to_invoice_manager() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        loginPage.enterUsernamePassword();
        loginPage.clickLoginButton();
        loginPage.verifyLoggedInMessage();

    }

    @When("I navigate to add sales page")
    public void i_navigate_to_add_sales_page() {

    }

    @When("I enter all the required fields in add sales page")
    public void i_enter_all_the_required_fields_in_add_sales_page() {

    }

    @When("I click Add Invoice Button")
    public void i_click_add_invoice_button() {

    }

    @Then("verify invoice successfully added message in list invoices page")
    public void verify_invoice_successfully_added_message_in_list_invoices_page() {

    }

}
