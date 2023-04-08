package StepDefinitions;

import Pages.DialogContent;
import Utility.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("Nagivate to Campus")
    public void nagivateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.sendKeysFunction(dc.username,"turkeyts");
        dc.sendKeysFunction(dc.password,"TechnoStudy123");
        dc.clickFunction(dc.loginButton);

    }
    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy,"Techno Study");
    }


    @And("Create citizenship")
    public void createCitizenship() {
        System.out.println("Merhaba etka bey");
    }
}
