package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.dashboardPage;
import com.sandikurnia.pages.forgotPasswordPage;
import com.sandikurnia.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends testBase {

    loginPage login;


    public loginStepDef () {
        super();
    }

    @Given("User go to {string}")
    public void userGoTo(String arg0) {
        initialization();
        login = new loginPage();

    }

    @When("User in login page")
    public void userInPage() {
        login.userGetTittleLoginOnMainPage();
    }

    @And("User click username field")
    public void userClickUsernameField() {
        login.userClickUsernameField();
    }

    @And("User input valid username")
    public void userInputValidUsername() {
        login.userInputValidUsername();
    }

    @And("User click password field")
    public void userClickPasswordField() {
        login.userClickPasswordField();
    }
    @And("User input valid password")
    public void userInputValidPassword() {
        login.userInputValidPassword();
    }

    @And("User input invalid username")
    public void userInputInvalidUsername() {
        login.userInputInvalidUsername();
    }
    @And("User input invalid password")
    public void userInputInvalidPassword() {
        login.userInputInvalidPassword();
    }

    @And("User input blank username")
    public void userInputBlankUsername() {
        login.userInputBlankPassword();
    }
    @And("User click login button")
    public void userClickLoginButton() {
        login.userClickLoginBtn();
    }

    @And("User input blank password")
    public void userInputBlankPassword() {
        login.userInputBlankPassword();
    }

    @Then("User success to login")
    public void userSuccessToLogin() throws Exception {
        login.userCanViewMainPageAfterSuccessLogin();
        driver.quit();
    }

    @Then("User get notification Incorrect Username and Password")
    public void userGetNotificationIncorrectUsernameAndPassword() {
        login.userGetIncorrectUsernameAndPassword();
        driver.quit();
    }
    @Then("User get notification Username Cannot Be Blank")
    public void userGetNotificationUsernameCannotBeBlank() {
        login.userGetNotifUsernameCannotBeBlank();
        driver.quit();

    }
    @Then("User get notification Password Cannot Be Blank")
    public void userGetNotificationPasswordCannotBeBlank() {
        login.userGetNotifPasswordCannotBeBlank();
        driver.quit();
    }

    @Then("User get notification Username & Password Cannot Be Blank")
    public void userGetNotificationUsernamePasswordCannotBeBlank() {
        login.userGetNotifUsernameCannotBeBlank();
        login.userGetNotifPasswordCannotBeBlank();
        driver.quit();
    }

}
