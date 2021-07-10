package com.toolsqa.automation.tasks;

import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsProperties implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.confiProperties();
        actor.attemptsTo(
                Enter.theValue(SpecialMethods.properties.getProperty("name")).into(FormPage.FIRSTNAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("lastname")).into(FormPage.LASTNAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("email")).into(FormPage.EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER),
                Enter.theValue(SpecialMethods.properties.getProperty("mobile")).into(FormPage.MOBILE_INPUT),
                Hit.the(Keys.CONTROL,Keys.BACK_SPACE,Keys.BACK_SPACE).into(FormPage.BIRTHDAY_INPUT),
                Enter.keyValues("Sep 1993").into(FormPage.BIRTHDAY_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.BIRTHDAY_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("subjects")).into(FormPage.SUBJECTS_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.SUBJECTS_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(FormPage.PICTURE_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("address")).into(FormPage.ADDRESS_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("state")).into(FormPage.STATE_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.STATE_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("city")).into(FormPage.CITY_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)

        );
    }

    public static FillAllFieldsProperties FormSuccessful(){
        return instrumented(FillAllFieldsProperties.class);
    }
}
