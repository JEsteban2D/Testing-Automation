package com.google.automation.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpenBrowserStepDefinitions {

    public WebDriver driver;

    @Given("^that a web user wants to register in advantage shopping online on chrome$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnlineOnChrome() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Youtube");
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='LC20lb DKV0Md'])[1]")).click();
        driver.findElement(By.name("search_query")).sendKeys("la capital");
        driver.findElement(By.id("search-icon-legacy")).click();

    }


    @When("^perform an automation on chrome$")
    public void performAnAutomationOnChrome() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^close browser on chrome$")
    public void closeBrowserOnChrome() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

    @Given("^that a web user wants to register in advantage shopping online on firefox$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnlineOnFirefox() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Youtube");
        driver.findElement(By.name("btnK")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='LC20lb DKV0Md'])[1]")).click();
        driver.findElement(By.name("search_query")).sendKeys("la capital");
        driver.findElement(By.id("search-icon-legacy")).click();
    }

    @When("^perform an automation on firefox$")
    public void performAnAutomationOnFirefox() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^close browser on firefox$")
    public void closeBrowserOnFirefox() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }


}
