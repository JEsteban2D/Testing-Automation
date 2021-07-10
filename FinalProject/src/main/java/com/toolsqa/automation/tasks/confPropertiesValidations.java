package com.toolsqa.automation.tasks;

import com.toolsqa.automation.questions.GetTextQuestion;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class confPropertiesValidations implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.confiProperties();
        actor.should(
                seeThat(GetTextQuestion.in(FormPage.ADDRESS_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("confidentialValidations"))),
                seeThat(GetTextQuestion.in(FormPage.EMAIL_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("confidentialValidations"))),
                seeThat(GetTextQuestion.in(FormPage.MOBILE_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("confidentialValidations")))
        );
    }
    public static confPropertiesValidations compareText(){
        return instrumented(confPropertiesValidations.class);
    }
}
