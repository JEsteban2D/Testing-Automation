package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.questions.GetTextQuestion;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ExcelValidations implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.should(
                    seeThat(GetTextQuestion.in(FormPage.ADDRESS_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getValidationsSheetName(),0,0))),
                    seeThat(GetTextQuestion.in(FormPage.EMAIL_VALIDATION),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getValidationsSheetName(),0,1)))


            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ExcelValidations compareText(){
        return instrumented(ExcelValidations.class);
    }
}
