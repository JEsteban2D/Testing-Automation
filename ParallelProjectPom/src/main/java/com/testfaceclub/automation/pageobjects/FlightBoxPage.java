package com.testfaceclub.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.testfaceclub.com/aut-vuelos/")

public class FlightBoxPage extends PageObject {


    public By FromInput = By.id("from");
    public By ToInput = By.id("to");
    public By ClassInput = By.id("classId");
    public By PassenInput = By.id("passenger");
    public By DateFromInput = By.xpath("//*[@ng-model='dateFrom' ]");
    public By DateToInput = By.xpath("//*[@ng-model='dateto' ]");
    public By NameInput = By.xpath("//*[@ng-model='name']");
    public By LastNameInput = By.xpath("//*[@ng-model='lastName']");

    public void sendFrom(){
        getDriver().findElement(FromInput).click();
    }
    public void sendTo(){
        getDriver().findElement(ToInput).click();
    }
    public void sendClass(){
        getDriver().findElement(ClassInput).click();
    }
    public void sendPassen(){
        getDriver().findElement(PassenInput).click();
    }
    public void sendDateFrom(){
        getDriver().findElement(DateFromInput).click();
    }
    public void sendDateTo(){
        getDriver().findElement(DateToInput).click();
    }

    public void sendName(String name){
        getDriver().findElement(NameInput).click();
    }
    public void sendLastName(String lastName){
        getDriver().findElement(LastNameInput).click();
    }

}
