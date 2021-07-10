package com.google.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;



public class OpenBrowserStepDefinitions {

    public WebDriver driver;


    @Given("^that a web user wants to register in advantage shopping online on chrome$")

        public void that_a_web_user_wants_to_register_in_advantage_shopping_online_on_chrome () {
            // Write code here that turns the phrase above into concrete actions
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @When("^perform an automation on chrome$")
        public void perform_an_automation_on_chrome () {
            // Write code here that turns the phrase above into concrete actions

        }

        @Then("^close browser on chrome$")
        public void close_browser_on_chrome () {
            // Write code here that turns the phrase above into concrete actions
            driver.quit();
        }


        @Given("^that a web user wants to register in advantage shopping online on firefox$")

        public void that_a_web_user_wants_to_register_in_advantage_shopping_online_on_firefox () {
            // Write code here that turns the phrase above into concrete actions
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @When("^perform an automation on firefox$")
        public void perform_an_automation_on_firefox () {
            // Write code here that turns the phrase above into concrete actions

        }

        @Then("^close browser on firefox$")
        public void close_browser_on_firefox () {
            // Write code here that turns the phrase above into concrete actions
            driver.quit();
        }



}
