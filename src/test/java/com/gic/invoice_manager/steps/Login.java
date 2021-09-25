package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import com.gic.invoice_manager.utils.InvoiceConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends CommonFunctions {

    @Given("^I'm On Invoice Manager Login Page$")
    public void i_m_On_Invoice_Manager_Login_Page()  {
        driver.get(InvoiceConstants.APPLICATION_URL);
    }

    @Given("^I enter Username as \"(.*?)\"$")
    public void i_enter_Username_as(String userName)  {
        driver.findElement(By.id("inputEmail")).sendKeys(userName);
    }

    @Given("^I enter Password as \"(.*?)\"$")
    public void i_enter_Password_as(String password)  {
        driver.findElement(By.id("inputPassword")).sendKeys(password);
    }

    @When("^I click on Login$")
    public void i_click_on_Login()  {
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
    }

    @Then("^I redirected to Invioce Manager Home Page$")
    public void i_redirected_to_Invioce_Manager_Home_Page()  {
       WebElement loginSuccessfulElement = driver.findElement(By.xpath("//p[contains(text(),'Logged In Successfully')]"));
        Assert.assertTrue(loginSuccessfulElement.isDisplayed());
    }
}
