package com.sandikurnia.pages;

import com.sandikurnia.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forgotPasswordPage extends testBase {
    WebDriverWait wait = new WebDriverWait(driver, 3);

    //TEST DATA
    String registeredEmail = "";
    String unregisteredEmail = "SandikurniaSPE@gmail.com";
    String nullData = "";

    //DEFINE ELEMENT LOCATOR

    //FIELD
    By emailField = By.id("passwordresetrequestform-email");

    //BUTTON
    By forgotPasswordBtn = By.xpath("//*[contains(text(),'Forgot password ?')]");
    By sendBtn = By.xpath("//*[contains(text(),'Send')]");

    //ASSERTION

    By titleForgotPasswordMainPage = By.xpath("/descendant::b[text()='Forgot Password']");

    By notifErrorUnregisteredUser = By.xpath("/descendant::div[text()='There is no user with this email address or this user is inactive.']");

    By notifErrorBlankEmail = By.xpath("descendant::div[text()='Email cannot be blank.']");

    // ----------------------------- METHOD ----------------------------- \\

    //CLICK
    public void userClickForgotPasswordBtn(){
        driver.findElement(forgotPasswordBtn).click();
    }
    public void userClickEmailField(){
        driver.findElement(emailField).click();
    }
    public void userClickSendBtn(){
        driver.findElement(sendBtn).click();
    }

    //INPUT
    public void userInputUnregisteredEmail(){
        driver.findElement(emailField).sendKeys(unregisteredEmail);
    }
    public void userInputBlankEmail(){
        driver.findElement(emailField).sendKeys(nullData);
    }

    //ASSERTION TO GET NOTIFICATION ERROR

    public void userCanViewThatTittleOfForgorPasswordPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(titleForgotPasswordMainPage)).isDisplayed();
    }
    public void userGetNotifErrorNoUserWithEmail(){
        wait.until(ExpectedConditions.presenceOfElementLocated(notifErrorUnregisteredUser)).isDisplayed();
    }
    public void userGetNotifErrorBlankEmail(){
        wait.until(ExpectedConditions.presenceOfElementLocated(notifErrorBlankEmail)).isDisplayed();
    }

}
