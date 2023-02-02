package com.sandikurnia.pages;

import com.sandikurnia.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends testBase {
    WebDriverWait wait = new WebDriverWait(driver, 3);

    //TEST DATA
    String usernameTestValidData = "Qa Skill Test";
    String passwordTestValidData = "Spe-2023";
    String usernameTestInvalidData = "Sandi Kurnia";
    String passwordTestInvalidData = "Spe-X123";
    String nullData = "";

    // DEFINE ELEMENT LOCATOR \\

    //FIELD
    By usernameField = By.id("loginform-username");
    By passwordField = By.id("loginform-password");

    //BUTTON

    By loginBtn = By.xpath("//*[contains(@name,'login-button')]");

    //ASSERTION

    By titleLoginOnMainPage = By.xpath("/descendant::b[text()='Login']");
    By notifUsernameCannotBeBlank = By.xpath("/descendant::div[text()='Username cannot be blank.']");
    By notifPasswordCannotBeBlank = By.xpath("/descendant::div[text()='Password cannot be blank.']");

    By notifIncorrectUsernameOrPassword = By.xpath("/descendant::div[text()='Incorrect username or password.']");

    By showingMainPageapiPayment = By.xpath("/descendant::span[text()='API Payment VA']");


    // ----------------------------- METHOD ----------------------------- \\

    // NAVIGATE USER TO
    public loginPage (){
        driver.navigate().to("https://admin-tap.spesandbox.com/site/login");
    }

    //CLICK
    public void userClickUsernameField(){
        driver.findElement(usernameField).click();
    }
    public void userClickPasswordField(){
        driver.findElement(passwordField).click();
    }

    public void userClickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    //INPUT VALID DATA
    public void userInputValidUsername(){
        driver.findElement(usernameField).sendKeys(usernameTestValidData);
    }
    public void userInputValidPassword(){
        driver.findElement(passwordField).sendKeys(passwordTestValidData);
    }

    //INPUT INVALID DATA
    public void userInputInvalidUsername(){
        driver.findElement(usernameField).sendKeys(usernameTestInvalidData);
    }
    public void userInputInvalidPassword(){
        driver.findElement(passwordField).sendKeys(passwordTestInvalidData);
    }

    //INPUT BLANK DATA
    public void userInputBlankUsername(){
        driver.findElement(usernameField).sendKeys(nullData);
    }
    public void userInputBlankPassword(){
        driver.findElement(passwordField).sendKeys(nullData);
    }


    //ASSERTION TO SUCCESS LOGIN
    public void userCanViewMainPageAfterSuccessLogin () throws Exception {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(showingMainPageapiPayment)).isDisplayed();
    }

    //ASSERTION TO GET NOTIFICATION ERROR

    public void userGetTittleLoginOnMainPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleLoginOnMainPage)).isDisplayed();
    }

    public void userGetIncorrectUsernameAndPassword(){
        wait.until(ExpectedConditions.presenceOfElementLocated(notifIncorrectUsernameOrPassword)).isDisplayed();

    }
    public void userGetNotifUsernameCannotBeBlank(){
        wait.until(ExpectedConditions.presenceOfElementLocated(notifUsernameCannotBeBlank)).isDisplayed();
    }
    public void userGetNotifPasswordCannotBeBlank(){
        wait.until(ExpectedConditions.presenceOfElementLocated(notifPasswordCannotBeBlank)).isDisplayed();
    }

}
