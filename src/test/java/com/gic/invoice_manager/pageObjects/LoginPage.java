package com.gic.invoice_manager.pageObjects;

import com.gic.invoice_manager.utils.InvoiceConstants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(id = "inputEmail")
    private WebElement userNameTextField;

    @FindBy(id = "inputPassword")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Logged In Successfully')]")
    private WebElement loginSuccessfulText;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void goToLoginPage() {
        LOGGER.info("Opening login page url");
        driver.get(InvoiceConstants.APPLICATION_URL + InvoiceConstants.LOGIN_ENDPOINT);
    }

    public void enterUsernamePassword() {
        LOGGER.info("Entering username!");
        userNameTextField.sendKeys(InvoiceConstants.ADMIN_USERNAME);
        LOGGER.info("Entering password!");
        passwordTextField.sendKeys(InvoiceConstants.ADMIN_PASSWORD);

    }

    public void clickLoginButton() {
        LOGGER.info("Clicking login button!");
        loginButton.click();
    }

    public void verifyLoggedInMessage() {
        LOGGER.info("Verifying successfully logged in message displayed!");
        Assert.assertTrue(loginSuccessfulText.isDisplayed());
        LOGGER.info("Asserting successfully logged in message!");
        Assert.assertEquals(loginSuccessfulText.getText(), "Logged In Successfully");

    }



}
