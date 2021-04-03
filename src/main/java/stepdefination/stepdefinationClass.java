package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.pageObjectClass;

public class stepdefinationClass {
    pageObjectClass pgo = new pageObjectClass();
    @Given("API url")
    public void api_url() {
        // Write code here that turns the phrase above into concrete actions
        pgo.apiUrl();
    }

    @When("navigate to URL")
    public void navigate_to_url() {
        // Write code here that turns the phrase above into concrete actions
        pgo.navigateUrl();
    }

    @Then("verify API values")
    public void verify_api_values() {
        // Write code here that turns the phrase above into concrete actions
        pgo.verifyVal();
    }


}
