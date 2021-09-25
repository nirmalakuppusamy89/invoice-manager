package com.gic.invoice_manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/gic/invoice_manager/features",
        glue = {""},
        tags = "@invoice-manager",
        dryRun = false)
public class InvoiceRunner {

}
