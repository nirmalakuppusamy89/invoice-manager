package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    public LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("^I'm on the invoice manager login page$")
    public void i_m_on_invoice_manager_login_page() {
        loginPage.goToLoginPage();
    }

    @Given("^I enter invoice manager admin username and password$")
    public void i_enter_Username_as() {
        loginPage.enterUsernamePassword();
    }

    @When("^I click login button$")
    public void i_click_on_Login() {
        loginPage.clickLoginButton();

    }

    @Then("^I should redirected to invoice manager home page$")
    public void i_redirected_to_invoice_manager_home_page() {
        loginPage.verifyLoggedInMessage();
    }


}
