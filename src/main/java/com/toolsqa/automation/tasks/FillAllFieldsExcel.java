package com.toolsqa.automation.tasks;

import com.toolsqa.automation.models.DataInjection;
import com.toolsqa.automation.ui.FormPage;
import com.toolsqa.automation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsExcel implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,0)).into(FormPage.FIRSTNAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,1)).into(FormPage.LASTNAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,2)).into(FormPage.EMAIL_INPUT),
                    JavaScriptClick.on(FormPage.GENDER),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,3)).into(FormPage.MOBILE_INPUT),
                    JavaScriptClick.on(FormPage.BIRTHDAY_INPUT),
                    Hit.the(Keys.CONTROL,Keys.BACK_SPACE,Keys.BACK_SPACE).into(FormPage.BIRTHDAY_INPUT),
                    Enter.keyValues("Sep 1993").into(FormPage.BIRTHDAY_INPUT),
                    Hit.the(Keys.ENTER).into(FormPage.BIRTHDAY_INPUT),
                    Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,8)).into(FormPage.SUBJECTS_INPUT),
                    Hit.the(Keys.ENTER).into(FormPage.SUBJECTS_INPUT),
                    JavaScriptClick.on(FormPage.HOBBIES_INPUT),
                    Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,7)).into(FormPage.PICTURE_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,4)).into(FormPage.ADDRESS_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,5)).into(FormPage.STATE_INPUT),
                    Hit.the(Keys.ENTER).into(FormPage.STATE_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(),dataInjection.getSheetName(),0,6)).into(FormPage.CITY_INPUT),
                    Hit.the(Keys.ENTER).into(FormPage.CITY_INPUT),
                    JavaScriptClick.on(FormPage.SUBMIT_BUTTON)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FillAllFieldsExcel dataInjectionSheet(){
        return instrumented(FillAllFieldsExcel.class);
    }


}
