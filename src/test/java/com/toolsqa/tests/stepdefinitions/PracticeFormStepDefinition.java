package com.toolsqa.tests.stepdefinitions;

import com.toolsqa.automation.interactions.OpenTheBrowser;
import com.toolsqa.automation.tasks.*;
import com.toolsqa.automation.ui.FormPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeFormStepDefinition {

    /*CONFIGURACION DEL DRIVER Y EL ACTOR*/
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Global").can(BrowseTheWeb.with(driver));
    }

    /*---------------SCENARIO 1-----------------------------------*/

    @Given("^that a web user wants to form in ToolsQA$")
    public void thatAWebUserWantsToFormInToolsQA() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormPage.URL));
    }


    @When("^all the fields are filled$")
    public void allTheFieldsAreFilled() {
        theActorInTheSpotlight().attemptsTo(FillAllFields.successful());
    }




    @Then("^he should see the confirmation window$")
    public void heShouldSeeTheConfirmationWindow() {
        theActorInTheSpotlight().attemptsTo(FormValidations.compareText());
    }

    /*---------------SCENARIO 2-----------------------------------*/

    @Given("^that a web user wants to form in ToolsQA with excel$")
    public void thatAWebUserWantsToFormInToolsQAWithExcel() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormPage.URL));
    }

    @When("^all the fields are filled with excel$")
    public void allTheFieldsAreFilledWithExcel() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsExcel.dataInjectionSheet());
    }

    @Then("^he should see the confirmation window with excel$")
    public void heShouldSeeTheConfirmationWindowWithExcel() {
        theActorInTheSpotlight().attemptsTo(ExcelValidations.compareText());
    }

    /*---------------SCENARIO 3-----------------------------------*/

    @Given("^that a web user wants to form in ToolsQA with confiproperties$")
    public void thatAWebUserWantsToFormInToolsQAWithConfiProperties() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FormPage.URL));
    }


    @When("^all the fields are filled with confiproperties$")
    public void allTheFieldsAreFilledWithConfiProperties() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsProperties.FormSuccessful());
    }

    @Then("^he should see the confirmation window with confiproperties$")
    public void heShouldSeeTheConfirmationWindowWithConfiProperties() {
        theActorInTheSpotlight().attemptsTo(confPropertiesValidations.compareText());
    }
}
