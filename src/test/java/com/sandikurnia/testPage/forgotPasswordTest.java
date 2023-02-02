package com.sandikurnia.testPage;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.forgotPasswordPage;
import com.sandikurnia.pages.loginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forgotPasswordTest extends testBase {

// NOTE : Karena tidak ada email testing disini saya mencoba
// pengujian dengan mengggunakkan unregistered email, terimakasih.

    forgotPasswordPage forgotPassword;

    public forgotPasswordTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        forgotPassword = new forgotPasswordPage();
    }

    @Test(priority = 0)
    public void User_Forgot_Password_With_Input_Unregistered_Email(){
        forgotPassword.userClickForgotPasswordBtn();
        forgotPassword.userClickEmailField();
        forgotPassword.userInputUnregisteredEmail();
        forgotPassword.userClickSendBtn();
        forgotPassword.userGetNotifErrorNoUserWithEmail();
    }

    @Test(priority = 0)
    public void User_Forgot_Password_With_Input_Blank_Email(){
        forgotPassword.userClickForgotPasswordBtn();
        forgotPassword.userClickEmailField();
        forgotPassword.userInputBlankEmail();
        forgotPassword.userClickSendBtn();
        forgotPassword.userGetNotifErrorBlankEmail();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
