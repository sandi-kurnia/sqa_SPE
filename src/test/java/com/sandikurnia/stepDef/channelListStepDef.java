package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.channelListPage;
import com.sandikurnia.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.File;

public class channelListStepDef extends testBase {

    channelListPage channelList;
    loginPage login;
    String downloads = "/Downloads/";

    public channelListStepDef(){
        super();
    }
    @Given("User already to login at url spesandbox.com")
    public void userAlreadyToLoginAtUrlSpesandboxCom() throws Exception{
        initialization();
        channelList = new channelListPage();
        login = new loginPage();
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        login.userCanViewMainPageAfterSuccessLogin();
    }

    @When("User click channel list menu")
    public void userClickChannelListMenu() {
        channelList.userClickChannelListMenuBtn();
    }

    @And("User click channel dropdown button")
    public void userClickClickChannelDropdownButton() {
        channelList.userClickChannelDropDownBtn();
    }

    @And("User select channel name")
    public void userSelectChannelName() {
        channelList.userSelectChannelName();
    }

    @And("User click email channel list field")
    public void userClickEmailChannelListField() {
        channelList.userClickEmailField();
    }

    @And("User input registered email")
    public void userInputRegisteredEmail() throws Exception {
        channelList.userInputEmail();
    }

    @And("User click download report button")
    public void userClickDownloadReportButton() throws Exception {
        channelList.userClickDownloadReportBtn();
    }

    @And("User select pdf type format")
    public void userSelectPdfTypeFormat() {
        channelList.userSelectPDF();
    }

    @Then("User success to download pdf report channel list")
    public void userSuccessToDownloadPdfReportChannelList() throws Exception{
        Thread.sleep(3000);
        File folder = new File(System.getProperty("user.home") +downloads);
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        for (File listOfFile : listOfFiles) {

            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                System.out.println("File " + listOfFile.getName());
                if (fileName.matches("channel-list.xlsx")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded jpeg is not found");
        f.deleteOnExit();
        driver.quit();
    }


    @And("User click add channel button")
    public void userClickAddChannelButton() {
        channelList.userClickAddChannel();
    }

    @And("User fill all the required text field")
    public void userFillAllTheRequiredTextField() {
        channelList.userClickUserNameField();
        channelList.userInputUserName();
        channelList.userClickThirdPartyNameField();
        channelList.userInputThirdPartyName();
        channelList.userClickBranchCodeField();
        channelList.userInputBranchCode();
        channelList.userClickDebitAccountNumberField();
        channelList.userInputDebitAccountNumber();
        channelList.userClickDebitFeeAccountField();
        channelList.userInputDebitFeeAccount();
        channelList.userClickDebitMethodDropDownButton();
        channelList.userSelectDebitMethod();
        channelList.userUploadSuppportedFile();
        channelList.userClickUploadBtn();
        channelList.userSwitchExpiredDatingButton();
        channelList.userClickMaxExpiredField();
        channelList.userInputMaxExpiredDate();
        channelList.userCLickSwitchStatusButton();
        channelList.userClickMinAmountField();
        channelList.userInputMinAmount();
        channelList.userClickMaxAmountField();
        channelList.userInputMaxAmount();
        channelList.userSelectPrefixTypeFix();
        channelList.userClickEmailAddChannelField();
        channelList.userInputEmailAddChannel();
        channelList.userClickPhoneNumberAddChannelField();
        channelList.userInputPhoneNumberAddChannel();
        channelList.userClickAddressAddChannelField();
        channelList.userInputAddressAddChannel();
        channelList.userClickFeeSpeField();
        channelList.userInputFeeSPE();
        channelList.userClickFeeBNIField();
        channelList.userInputFeeBNIField();
        channelList.userClickFeeThirdPartyField();
        channelList.userInputFeeThirdParty();
        channelList.userClickIpWhiteListField();
        channelList.userInputIpWhitelIST();
        channelList.userClickCallBackUrlField();
        channelList.userInputCallbackUrl();
    }

    @And("User click save button")
    public void userClickSaveButton() {
        channelList.userClickSaveAddChannelBtn();
    }

    @Then("User successfully to add new channel")
    public void userSuccessfullyToAddNewChannel() {
        channelList.userCanViewThatSuccessfullyCreateChannel();
        driver.quit();
    }

    @And("User fills in all text fields except the required text fields")
    public void userFillsInAllTextFieldsExceptTheRequiredTextFields() {
        channelList.userClickUserNameField();
        channelList.userClickThirdPartyNameField();
        channelList.userInputThirdPartyName();
        channelList.userClickBranchCodeField();
        channelList.userInputBranchCode();
        channelList.userClickDebitAccountNumberField();
        channelList.userClickDebitFeeAccountField();
        channelList.userInputDebitFeeAccount();
        channelList.userClickDebitMethodDropDownButton();
        channelList.userSelectDebitMethod();
        channelList.userUploadSuppportedFile();
        channelList.userClickUploadBtn();
        channelList.userSwitchExpiredDatingButton();
        channelList.userClickMaxExpiredField();
        channelList.userInputMaxExpiredDate();
        channelList.userCLickSwitchStatusButton();
        channelList.userClickMinAmountField();
        channelList.userInputMinAmount();
        channelList.userClickMaxAmountField();
        channelList.userInputMaxAmount();
        channelList.userSelectPrefixTypeFix();
        channelList.userClickEmailAddChannelField();
        channelList.userClickPhoneNumberAddChannelField();
        channelList.userClickAddressAddChannelField();
        channelList.userClickFeeSpeField();
        channelList.userInputFeeSPE();
        channelList.userClickFeeBNIField();
        channelList.userInputFeeBNIField();
        channelList.userClickFeeThirdPartyField();
        channelList.userInputFeeThirdParty();
        channelList.userClickIpWhiteListField();
        channelList.userClickCallBackUrlField();
        channelList.userClickSaveAddChannelBtn();
    }

    @Then("User get a message that the * field is required")
    public void userGetAMessageThatTheFieldIsRequired() {
        channelList.userGetNotifChannelNameCannotBeBlank();
        channelList.userGetNotifAccountNumberCannotBeBlank();
        channelList.userGetNotifPicEmailCannotBeBlank();
        channelList.userGetNotifPicPhoneNumberCannotBeBlank();
        channelList.userGetNotifPicAddressCannotBeBlank();
        channelList.userGetNotifIPWhiteListCannotBeBlank();
        channelList.userGetNotifCallbackUrlDevCannotBeBlank();
        driver.quit();
    }

}
