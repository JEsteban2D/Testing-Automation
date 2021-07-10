package com.toolsqa.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PracticeForm.feature",
glue = "com.toolsqa.tests.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags = "@regression"
)
public class PracticeFormRunner {

}
