package com.testfaceclub.tests.stepdefinitions;


import com.testfaceclub.automation.steps.FlightBoxPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OpenBrowserStepDefinitions {

    @Steps
    FlightBoxPageSteps flightBoxPageSteps;

    @Given("^that a web user wants to register in advantage shopping online on chrome$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnlineOnChrome() {
        flightBoxPageSteps.OpenBrowser();
    }

    @When("^perform an automation on chrome$")
    public void performAnAutomationOnChrome() throws InterruptedException {
        flightBoxPageSteps.fillFieldsInFlightBoxPage();
    }

    @Then("^close browser on chrome$")
    public void closeBrowserOnChrome() {

    }

    @Given("^that a web user wants to register in advantage shopping online on firefox$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnlineOnFirefox() {
        flightBoxPageSteps.OpenBrowser();
    }

    @When("^perform an automation on firefox$")
    public void performAnAutomationOnFirefox() throws InterruptedException {
        flightBoxPageSteps.fillFieldsInFlightBoxPage();
    }

    @Then("^close browser on firefox$")
    public void closeBrowserOnFirefox() {

    }


}
