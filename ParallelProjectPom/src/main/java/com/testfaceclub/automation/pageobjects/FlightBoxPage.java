package com.testfaceclub.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.testfaceclub.com/aut-vuelos/")

public class FlightBoxPage extends PageObject {


    public By NameInput = By.xpath("//*[@ng-model='name']");
    public By LastNameInput = By.xpath("//*[@ng-model='lastName']");


    public void sendName(String name){
        getDriver().findElement(NameInput).click();
    }
    public void sendLastName(String lastName){
        getDriver().findElement(LastNameInput).click();
    }

}
