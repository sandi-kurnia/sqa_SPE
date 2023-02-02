package com.sandikurnia.testPage;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.channelListPage;
import com.sandikurnia.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class channelListTest extends testBase {

    loginPage login;
    channelListPage channelList;
    String downloads = "/Downloads/";

    public channelListTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        login = new loginPage();
        channelList = new channelListPage();
    }

    @Test(priority = 0)
    public void User_Download_Channel_List_PDF_Report_By_Input_Registered_Email()throws Exception{
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        channelList.userClickChannelListMenuBtn();
        channelList.userClickChannelDropDownBtn();
        channelList.userSelectChannelName();
        channelList.userClickEmailField();
        channelList.userInputEmail();
        channelList.userClickDownloadReportBtn();
        channelList.userSelectPDF();

        //ASSERTION TO SUCCESSFULL DOWNLOADED
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
    }


    @Test(priority = 1)
    public void User_Add_Channel_List_By_Fill_All_Required_Text_Field()throws Exception{
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        channelList.userClickChannelListMenuBtn();
        channelList.userClickAddChannel();
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
        channelList.userClickSaveAddChannelBtn();
        channelList.userCanViewThatSuccessfullyCreateChannel();
    }

    @Test
    public void User_Add_Channel_List_By_Unfilled_All_Required_Text_Field()throws Exception{
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        channelList.userClickChannelListMenuBtn();
        channelList.userClickAddChannel();
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
        channelList.userGetNotifChannelNameCannotBeBlank();
        channelList.userGetNotifAccountNumberCannotBeBlank();
        channelList.userGetNotifPicEmailCannotBeBlank();
        channelList.userGetNotifPicPhoneNumberCannotBeBlank();
        channelList.userGetNotifPicAddressCannotBeBlank();
        channelList.userGetNotifIPWhiteListCannotBeBlank();
        channelList.userGetNotifCallbackUrlDevCannotBeBlank();

    }

    @AfterMethod
    public void tearDown()throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }


}
