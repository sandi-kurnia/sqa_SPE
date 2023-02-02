package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.forgotPasswordPage;
import com.sandikurnia.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forgotPasswordStepDef extends testBase {

// NOTE : Karena tidak ada email testing disini saya mencoba
// pengujian dengan mengggunakkan unregistered email, terimakasih.

    forgotPasswordPage forgotPassword;


    public forgotPasswordStepDef(){
        super();
    }


    @When("User click forgot password button")
    public void userClickForgotPasswordButton() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userClickForgotPasswordBtn();
    }

    @Then("Success direct user to forgot password page")
    public void successDirectUserToForgotPasswordPage() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userCanViewThatTittleOfForgorPasswordPage();
    }

    @When("User in forgot password page")
    public void userInForgotPasswordPage() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userCanViewThatTittleOfForgorPasswordPage();
    }

    @And("User click email field")
    public void userClickEmailField() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userClickEmailField();
    }

    @And("User input unregistered email")
    public void userInputUnregisteredEmail() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userInputUnregisteredEmail();
    }

    @And("User click send button")
    public void userClickSendButton() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userClickSendBtn();
    }

    @Then("User get notification No User With This Email Address Or This User Is Inactive")
    public void userGetNotificationNoUserWithThisEmailAddressOrThisUserIsInactive() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userGetNotifErrorNoUserWithEmail();
        driver.quit();
    }

    @And("User input blank email")
    public void userInputBlankEmail() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userInputBlankEmail();
    }

    @Then("User get notification Email Cannot Be Blank")
    public void userGetNotificationEmailCannotBeBlank() {
        forgotPassword = new forgotPasswordPage();
        forgotPassword.userGetNotifErrorBlankEmail();
        driver.quit();
    }


}
