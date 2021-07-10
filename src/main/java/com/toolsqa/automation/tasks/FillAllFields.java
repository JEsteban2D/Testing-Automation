package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.UploadToField;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Date;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FillAllFields implements Task {

    DataInjection dataInjection = new DataInjection();

    public static String name;
    public static String gender;
    public static String email;
    public static String mobileNumber;
    public static Date birthday;
    public static String Address;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getName()).into(FormPage.FIRSTNAME_INPUT),
                Enter.theValue(dataInjection.getLastName()).into(FormPage.LASTNAME_INPUT),
                Enter.theValue(dataInjection.getEmail()).into(FormPage.EMAIL_INPUT),
                JavaScriptClick.on(FormPage.GENDER),
                Enter.theValue(dataInjection.getMobileNumber()).into(FormPage.MOBILE_INPUT),
                JavaScriptClick.on(FormPage.BIRTHDAY_INPUT),
                Hit.the(Keys.CONTROL,Keys.BACK_SPACE,Keys.BACK_SPACE).into(FormPage.BIRTHDAY_INPUT),
                Enter.keyValues("Sep 1993").into(FormPage.BIRTHDAY_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.BIRTHDAY_INPUT),
                Enter.keyValues("Maths").into(FormPage.SUBJECTS_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.SUBJECTS_INPUT),
                JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                Enter.keyValues("C:\\Users\\Usuario\\Desktop\\testing.jpg").into(FormPage.PICTURE_INPUT),
                Enter.theValue(dataInjection.getCurrentAddress()).into(FormPage.ADDRESS_INPUT),
                Enter.keyValues("Haryana").into(FormPage.STATE_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.STATE_INPUT),
                Enter.keyValues("Panipat").into(FormPage.CITY_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.CITY_INPUT),
                JavaScriptClick.on(FormPage.SUBMIT_BUTTON)
        );
        name = dataInjection.getName();
        gender = dataInjection.getGender();
        email = dataInjection.getEmail();
        mobileNumber = dataInjection.getMobileNumber();
        Address = dataInjection.getCurrentAddress();
    }

    public static FillAllFields successful(){
        return instrumented(FillAllFields.class);
    }
}
