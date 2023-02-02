package com.sandikurnia.testPage;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.loginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest extends testBase {

    loginPage login;

    public loginTest () {
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        login = new loginPage();
    }

    @Test(priority = 0)
    public void User_Login_With_Valid_Username_And_Valid_Password() throws Exception {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        login.userCanViewMainPageAfterSuccessLogin();

    }

    @Test(priority = 1)
    public void User_Login_With_InValid_Username_And_Valid_Password(){
        login.userClickUsernameField();
        login.userInputInvalidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        login.userGetIncorrectUsernameAndPassword();
    }

    @Test(priority = 2)
    public void User_Login_With_Valid_Username_And_Invalid_Password(){
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputInvalidPassword();
        login.userClickLoginBtn();
        login.userGetIncorrectUsernameAndPassword();
    }

    @Test(priority = 3)
    public void User_Login_With_Invalid_Username_And_Invalid_Password(){
        login.userClickUsernameField();
        login.userInputInvalidUsername();
        login.userClickPasswordField();
        login.userInputInvalidPassword();
        login.userClickLoginBtn();
        login.userGetIncorrectUsernameAndPassword();
    }

    @Test(priority = 4)
    public void User_Login_With_Blank_Username_And_Valid_Password(){
        login.userClickUsernameField();
        login.userInputBlankUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        login.userGetNotifUsernameCannotBeBlank();
    }

    @Test(priority = 5)
    public void User_Login_With_Valid_Username_And_Blank_Password(){
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputBlankPassword();
        login.userClickLoginBtn();
        login.userGetNotifPasswordCannotBeBlank();
    }

    @Test(priority = 6)
    public void User_Login_With_InValid_Username_And_Blank_Password(){
        login.userClickUsernameField();
        login.userInputInvalidUsername();
        login.userClickPasswordField();
        login.userInputBlankPassword();
        login.userClickLoginBtn();
        login.userGetNotifPasswordCannotBeBlank();
    }

    @Test(priority = 7)
    public void User_Login_With_Blank_Username_And_Invalid_Password(){
        login.userClickUsernameField();
        login.userInputBlankUsername();
        login.userClickPasswordField();
        login.userInputInvalidPassword();
        login.userClickLoginBtn();
        login.userGetNotifUsernameCannotBeBlank();
    }

    @Test(priority = 8)
    public void User_Login_With_Blank_Username_And_Blank_Password(){
        login.userClickUsernameField();
        login.userInputBlankUsername();
        login.userClickPasswordField();
        login.userInputBlankPassword();
        login.userClickLoginBtn();
        login.userGetNotifUsernameCannotBeBlank();
        login.userGetNotifPasswordCannotBeBlank();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
