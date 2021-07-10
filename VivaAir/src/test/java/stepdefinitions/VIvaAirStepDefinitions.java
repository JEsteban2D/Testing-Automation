package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.MakeReservation;
import ui.VivaAirPage;

public class VIvaAirStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("Global");
    private VivaAirPage vivaAirPage = new VivaAirPage();

    @Given("^a new user can enter the reservation page$")
    public void aNewUserCanEnterTheReservationPage() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(vivaAirPage));
    }

    @When("^make a flight reservation$")
    public void makeAFlightReservation() {
        actor.wasAbleTo(
                MakeReservation.ReserveAFlight()
        );
    }

    @Then("^he can choose the cheapest price$")
    public void heCanChooseTheCheapestPrice() {

    }
}
