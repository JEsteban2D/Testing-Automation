package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import ui.VivaAirPage;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakeReservation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(VivaAirPage.FROM),
                JavaScriptClick.on(VivaAirPage.COUNTRY_FROM),
                JavaScriptClick.on(VivaAirPage.TO),
                JavaScriptClick.on(VivaAirPage.COUNTRY_TO),
                JavaScriptClick.on(VivaAirPage.DATE_FROM),
                JavaScriptClick.on(VivaAirPage.DATE_TO),
                JavaScriptClick.on(VivaAirPage.SELECT_DATE_FROM),
                JavaScriptClick.on(VivaAirPage.SELECT_DATE_TO),
                JavaScriptClick.on(VivaAirPage.BUTTON_SEARCH),
                JavaScriptClick.on(VivaAirPage.SELECT_PRICE),
                JavaScriptClick.on(VivaAirPage.BUTTON_CONTINUE),
                JavaScriptClick.on(VivaAirPage.SELECT_PRICE),
                JavaScriptClick.on(VivaAirPage.BUTTON_CONTINUE),
                Enter.keyValues("Haryana").into(VivaAirPage.NAME),
                Enter.keyValues("TABORDA").into(VivaAirPage.LASTNAME),
                Enter.keyValues("planet@gmail.com").into(VivaAirPage.EMAIL),
                Enter.keyValues("1234560432").into(VivaAirPage.DOCUMENT),
                Enter.keyValues("3333333333").into(VivaAirPage.MOBILE)

        );
    }

    public static MakeReservation ReserveAFlight() {
        return instrumented(MakeReservation.class);
    }

}
