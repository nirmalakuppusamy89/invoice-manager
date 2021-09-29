package com.gic.invoice_manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {""},
        tags = "@delete-invoice")
public class InvoiceRunner {
}
