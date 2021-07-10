package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.vivaair.com/#/co/es")
public class VivaAirPage extends PageObject {
    public static final Target FROM = Target.the("").located(By.id("station"));
    public static final Target TO = Target.the("").located(By.id("station-second"));
    public static final Target DATE_FROM = Target.the("").located(By.id("date"));
    public static final Target DATE_TO = Target.the("").located(By.id("dateReturn"));
    public static final Target COUNTRY_FROM = Target.the("").located(By.xpath("//span[contains (text(), 'Medellín')]"));
    public static final Target COUNTRY_TO = Target.the("").located(By.xpath("//span[contains (text(), 'México')]"));
    public static final Target BUTTON_SEARCH = Target.the("").located(By.xpath("//span[@class = 'ibe__inputs-button'][1]"));
    public static final Target SELECT_DATE_FROM = Target.the("").located(By.xpath("//div[@class = 'calendar__date_picker__container__day date high'][contains (text (), '19')]"));
    public static final Target SELECT_DATE_TO = Target.the("").located(By.xpath("//div[@class = 'calendar__date_picker__container__day date high'][contains (text (), '26')]"));

    /*---------------------------------------*/

    public static final Target SELECT_PRICE = Target.the("").located(By.xpath("//fa-icon[@class = 'ng-fa-icon lowest-fare__arrow-icon'][1]"));
    public static final Target BUTTON_CONTINUE= Target.the("").located(By.id("booking-continue-btn"));

    public static final Target NAME = Target.the("").located(By.id("nombre1ADT"));
    public static final Target LASTNAME = Target.the("").located(By.id("apellido1ADT"));
    public static final Target EMAIL = Target.the("").located(By.id("correo-electronico1ADT"));
    public static final Target DOCUMENT = Target.the("").located(By.id("identificacion1ADT"));
    public static final Target MOBILE = Target.the("").located(By.id("telefono"));

}
