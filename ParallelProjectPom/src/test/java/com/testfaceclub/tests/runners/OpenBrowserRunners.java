package com.testfaceclub.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.testfaceclub.tests.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@regression")
public class OpenBrowserRunners {
}
