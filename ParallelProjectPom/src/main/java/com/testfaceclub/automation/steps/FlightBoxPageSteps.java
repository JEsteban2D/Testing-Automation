package com.testfaceclub.automation.steps;

import com.testfaceclub.automation.models.DataInjection;
import com.testfaceclub.automation.pageobjects.FlightBoxPage;
import com.testfaceclub.automation.utils.Times;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class FlightBoxPageSteps {
    FlightBoxPage flightBoxPage = new FlightBoxPage();
    DataInjection dataInjection = new DataInjection();


    @Step
    public void OpenBrowser(){
        flightBoxPage.open();
    }

    @Step
    public void fillFieldsInFlightBoxPage() throws InterruptedException {
        flightBoxPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);

        flightBoxPage.sendFrom();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"from\"]/option[5]")).click();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"from\"]/option[5]")).click();
        flightBoxPage.sendTo();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"to\"]/option[4]")).click();

        flightBoxPage.sendClass();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@label='Turista Superior' ]")).click();
        flightBoxPage.sendDateFrom();
        flightBoxPage.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();
        flightBoxPage.sendDateTo();
        flightBoxPage.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();
        flightBoxPage.sendPassen();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@ng-click='search()' ]")).click();

        Times.waitFor(5000);
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"flights\"]/div[1]/a")).click();

        Times.waitFor(10000);
        flightBoxPage.getDriver().findElement(By.id("cards"));
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"cards\"]/option[2]")).click();
        flightBoxPage.getDriver().findElement(By.id("cardNumber")).sendKeys("1231-2313-2333-3333");
        flightBoxPage.getDriver().findElement(By.id("code")).sendKeys("348");
        flightBoxPage.getDriver().findElement(By.id("cards")).click();
        flightBoxPage.getDriver().findElement(By.xpath("//*[@id=\"year\"]/option[4]")).click();
        flightBoxPage.sendName( dataInjection.getName());
        flightBoxPage.sendLastName( dataInjection.getLastName());
        flightBoxPage.getDriver().findElement(By.xpath("//*[@ng-click='book()']")).click();

        Times.waitFor(10000);
        flightBoxPage.getDriver().findElement(By.xpath("//*[@ng-click='gotoHome()']")).click();

    }
}
