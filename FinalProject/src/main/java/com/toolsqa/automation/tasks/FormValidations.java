package com.toolsqa.automation.tasks;




import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.questions.GetTextQuestion;
import com.toolsqa.automation.ui.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class FormValidations implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(

                seeThat(GetTextQuestion.in(FormPage.ADDRESS_VALIDATION),equalToIgnoringCase(dataInjection.getExtensionAddress()+FillAllFields.Address)),
                seeThat(GetTextQuestion.in(FormPage.EMAIL_VALIDATION),equalToIgnoringCase(dataInjection.getExtensionEmail()+FillAllFields.email)),
                seeThat(GetTextQuestion.in(FormPage.MOBILE_VALIDATION),equalToIgnoringCase(dataInjection.getExtensionMobile()+FillAllFields.mobileNumber))
        );
    }

    public static FormValidations compareText(){
        return instrumented(FormValidations.class);
    }
}
