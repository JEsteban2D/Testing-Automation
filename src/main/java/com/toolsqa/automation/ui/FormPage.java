package com.toolsqa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static String URL = "https://www.demoqa.com/automation-practice-form";
    public static  final Target FIRSTNAME_INPUT = Target.the("").located(By.id("firstName"));
    public static  final Target LASTNAME_INPUT = Target.the("").located(By.id("lastName"));
    public static  final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static  final Target GENDER = Target.the("").located(By.id("gender-radio-1"));
    public static  final Target MOBILE_INPUT = Target.the("").located(By.id("userNumber"));
    public static  final Target BIRTHDAY_INPUT = Target.the("").located(By.id("dateOfBirthInput"));
    public static  final Target SUBJECTS_INPUT = Target.the("").located(By.id("subjectsInput"));
    public static  final Target HOBBIES_INPUT = Target.the("").located(By.id("hobbies-checkbox-3"));
    public static  final Target PICTURE_INPUT = Target.the("").located(By.id("uploadPicture"));
    public static  final Target ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static  final Target STATE_INPUT = Target.the("").located(By.xpath("//*[@id='react-select-3-input' and @type='text']"));
    public static  final Target CITY_INPUT = Target.the("").located(By.xpath("//*[@id='react-select-4-input' and @type='text']"));
    public static  final Target SUBMIT_BUTTON= Target.the("").located(By.id("submit"));

    /*--------------------------VALIDATIONS---------------------------------*/

    public static  final Target EMAIL_VALIDATION = Target.the("").located(By.xpath("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[2]//td[2]"));
    public static  final Target ADDRESS_VALIDATION = Target.the("").located(By.xpath("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[9]//td[2]"));
    public static  final Target MOBILE_VALIDATION = Target.the("").located(By.xpath("//table[@class = 'table table-dark table-striped table-bordered table-hover']//tr[4]//td[2]"));

}
