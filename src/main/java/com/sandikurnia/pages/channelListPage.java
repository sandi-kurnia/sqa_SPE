package com.sandikurnia.pages;

import com.aventstack.extentreports.util.Assert;
import com.sandikurnia.base.testBase;
import com.sun.org.apache.bcel.internal.generic.DREM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class channelListPage extends testBase {

    String email = "sqa@gmail.com";
    String phoneNumber = "105142921212";
    String prefixType = "7";

    //DEFINE ELEMENT LOCATOR

    //BUTTON
    By channelListBtn = By.xpath("//*[contains(text(),' Channel List')]");
    By channelNameDropDownBtn = By.id("select2-channelsearch-channel_id_name-container");
    By joinedDateCalendarBtn = By.xpath("//*[contains(@class,'form__field pickadate picker__input')]");
    By channelStatusBtn = By.id("channelsearch-status");
    By downloadReportDropDownBtn = By.xpath("//*[contains(@class,'btn btn-light dropdown-toggle')]");
    By xlsx = By.xpath("//*[contains(text(),'xlsx')]");

    By addChannelBtn = By.xpath("//*[contains(text(),'Add Channel')]");
    By debitMethodDropDownBtn = By.xpath("//*[contains(@class,'select2-selection__arrow')]");
    By getExpiredDateSwitchBtn = By.xpath("//*[contains(@class,'el-switch-style')]");
    By minMaxStatusSwitchBtn = By.xpath("(//*[contains(@class,'el-switch el-switch-green')])[2]");
    By uploadFileBtn = By.id("do-upload");


    //FIELD
    By emailField = By.xpath("//*[contains(text(),'Email')]");
    By emailSearchField = By.xpath("//*[contains(@name,'ChannelSearch[pic_email]')]");

    By phoneNumberField = By.xpath("//*[contains(text(),'Phone Number')]");
    By phoneNumberSearchField = By.className("//*[contains(@name,'ChannelSearch[pic_phone_number]')]");

    By preferixTypeField = By.xpath("//*[contains(text(),'Preferix Type Accepted')])");
    By prefixTypeSearchField = By.xpath("//*[contains(@name,'ChannelSearch[prefix_type]')]");

    By channelNameField = By.id("channel-channel_name");
    By thirdPartyNameField = By.id("channel-third_party_name");
    By branchCode = By.id("channel-branch_code");
    By debitAccountNumberField = By.id("channel-account_number");
    By debitFeeAccountField = By.id("channel-debit_fee_account");
    By fileData = By.id("file_data");
    By maxExpiredDatedField = By.id("channel-max_expired_dated");
    By minAmountField = By.id("min_amount");
    By maxAmountField = By.id("max_amount");
    By checkBoxField = By.xpath("//*[contains(@class,'custom-control custom-checkbox')][8]");
    By emailFieldAddChannelField = By.xpath("//*[contains(@name,'Channel[pic_email]')]");
    By phoneNumberAddChannelField = By.xpath("//*[contains(@name,'Channel[pic_phone_number]')]");
    By addressAddChannelField = By.xpath("//*[contains(@name,'Channel[pic_address]')]");
    By feeSPEField = By.xpath("//*[contains(@name,'Channel[fee_spe]')]");
    By feeBniField = By.xpath("//*[contains(@name,'Channel[fee_bni]')]");
    By feeThirdPartyField = By.xpath("//*[contains(@name,'Channel[fee_third_party]')]");
    By iPWhiteListField = By.xpath("//*[contains(@name,'Channel[ip_whitelist]')]");
    By callBackUrlField = By.xpath("//*[contains(@name,'Channel[callback_url_dev]')]");

    By saveBtn = By.xpath("//*[contains(text(),'Save')]");
    By cancelBtn = By.xpath("//*[contains(text(),'Cancel')]");

    // ----------------------------- METHOD ----------------------------- \\

    public void userClickChannelListMenuBtn(){
        driver.findElement(channelListBtn).click();
    }
    public void userClickChannelDropDownBtn(){
        driver.findElement(channelNameDropDownBtn).click();
    }

    public void userSelectChannelName(){
        List<WebElement> channelName = driver.findElements(By.xpath("//*[contains(@class,'select2-results__option')]"));
        for (WebElement name : channelName){

            if(name.getText().equals("Channel Name")){
                name.click();
                return;
            }
        }
    }

    public void userClickEmailField(){
        driver.findElement(emailField).click();
    }

    public void userInputEmail()throws Exception{
        driver.findElement(emailSearchField).sendKeys(email);
        Thread.sleep(4000);
    }

    public void userClickPhoneNumberField()throws Exception{
        Thread.sleep(10000);
        driver.findElement(phoneNumberField).click();
    }

    public void userInputPhoneNumber(){
        driver.findElement(phoneNumberSearchField).sendKeys(phoneNumber);
    }
    public void userClickPrefixTypeAccepted(){
        driver.findElement(preferixTypeField).click();
    }
    public void userInputPrefixTypeAccepted(){
        driver.findElement(prefixTypeSearchField).sendKeys(prefixType);
    }

    public void userClickJoinedDateBtn(){
        driver.findElement(joinedDateCalendarBtn).click();
    }
    public void userSetDateJoined(){
        WebElement yearSelection = driver.findElement(By.className("picker__select--year"));
        Select a = new Select(yearSelection);
        a.selectByVisibleText("2023");

        WebElement monthSelection = driver.findElement(By.className("picker__select--month"));
        Select b = new Select(monthSelection);
        b.selectByVisibleText("January");

        List<WebElement> daysElement = driver.findElements(By.xpath("//*[contains(@class,'picker__day picker__day--infocus')]"));
        for (WebElement date : daysElement){

            if(date.getText().equals("31")){
                date.click();
                date.click();
                return;
            }
        }
    }

    public void userClickDownloadReportBtn()throws Exception{
        Thread.sleep(3000);
        driver.findElement(downloadReportDropDownBtn).click();
        Thread.sleep(3000);
        driver.findElement(downloadReportDropDownBtn).click();
    }
    public void userSelectPDF(){
        driver.findElement(xlsx).click();
    }

    public void userClickAddChannel(){
        driver.findElement(addChannelBtn).click();
    }

    public void userClickUserNameField(){
        driver.findElement(channelNameField).click();
    }

    public void userClickThirdPartyNameField(){
        driver.findElement(thirdPartyNameField).click();
    }

    public void userClickBranchCodeField(){
        driver.findElement(branchCode).click();
    }

    public void userClickDebitAccountNumberField(){
        driver.findElement(debitAccountNumberField).click();
    }

    public void userClickDebitFeeAccountField(){
        driver.findElement(debitFeeAccountField).click();
    }
    public void userClickDebitMethodDropDownButton(){
        driver.findElement(debitMethodDropDownBtn).click();
    }
    public void userUploadSuppportedFile(){
        driver.findElement(fileData).sendKeys("/Users/sandikurnia/Documents/QualityAssurance_SandiKurnia/src/main/java/com/sandikurnia/TestFileUpload/Template Blacklist Client.xlsx");
    }
    public void userClickUploadBtn(){
        driver.findElement(uploadFileBtn).click();
    }
    public void userSwitchExpiredDatingButton(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        driver.findElement(getExpiredDateSwitchBtn).click();
    }
    public void userClickMaxExpiredField(){
        driver.findElement(maxExpiredDatedField).click();
    }
    public void userCLickSwitchStatusButton(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        driver.findElement(minMaxStatusSwitchBtn).click();
    }
    public void userClickMinAmountField(){
        driver.findElement(minAmountField).click();
    }
    public void userClickMaxAmountField(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        driver.findElement(maxAmountField).click();
    }
    public void userSelectPrefixTypeFix(){
        driver.findElement(checkBoxField).click();
    }
    public void userClickEmailAddChannelField(){
        driver.findElement(emailFieldAddChannelField).click();
    }
    public void userClickPhoneNumberAddChannelField(){
        driver.findElement(phoneNumberAddChannelField).click();
    }
    public void userClickAddressAddChannelField(){
        driver.findElement(addressAddChannelField).click();
    }
    public void userClickFeeSpeField(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        driver.findElement(feeSPEField).click();
    }
    public void userClickFeeBNIField(){
        driver.findElement(feeBniField).click();
    }
    public void userClickFeeThirdPartyField(){
        driver.findElement(feeThirdPartyField).click();
    }
    public void userClickIpWhiteListField(){
        driver.findElement(iPWhiteListField).click();
    }
    public void userClickCallBackUrlField(){
        driver.findElement(callBackUrlField).click();
    }
    public void userClickSaveAddChannelBtn(){
        driver.findElement(saveBtn).click();
    }
    public void userClickCancelAddChannelBtn(){
        driver.findElement(cancelBtn).click();
    }

    //INPUT

    public void userInputUserName(){
        driver.findElement(channelNameField).sendKeys("sayonaru");
    }
    public void userInputThirdPartyName(){
        driver.findElement(thirdPartyNameField).sendKeys("okatau");
    }
    public void userInputBranchCode(){
        driver.findElement(branchCode).sendKeys("100002");
    }
    public void userInputDebitAccountNumber(){
        driver.findElement(debitAccountNumberField).sendKeys("10000010001");
    }
    public void userInputDebitFeeAccount(){
        driver.findElement(debitFeeAccountField).sendKeys("202020202022");
    }
    public void userSelectDebitMethod() {
        List<WebElement> debitMethod = driver.findElements(By.xpath("//*[contains(@class,'select2-results__option')]"));
        for (WebElement debit : debitMethod) {

            if (debit.getText().equals("Direct Debit")) {

                debit.click();
                return;
            }
        }
    }
    public void userInputMaxExpiredDate(){
        driver.findElement(maxExpiredDatedField).sendKeys("2023");
    }
    public void userInputMinAmount(){
        driver.findElement(minAmountField).sendKeys("2");

    }
    public void userInputMaxAmount(){
        driver.findElement(maxAmountField).sendKeys("5");
    }
    public void userInputEmailAddChannel(){
        driver.findElement(emailFieldAddChannelField).sendKeys("emailtest3@gmail.com");
    }
    public void userInputPhoneNumberAddChannel(){
        driver.findElement(phoneNumberAddChannelField).sendKeys("0812345678112");
    }
    public void userInputAddressAddChannel(){
        driver.findElement(addressAddChannelField).sendKeys("jl.ketapang");
    }
    public void userInputFeeSPE(){
        driver.findElement(feeSPEField).sendKeys("100");
    }
    public void userInputFeeBNIField(){
        driver.findElement(feeBniField).sendKeys("250");
    }
    public void userInputFeeThirdParty(){
        driver.findElement(feeThirdPartyField).sendKeys("350");
    }
    public void userInputIpWhitelIST(){
        driver.findElement(iPWhiteListField).sendKeys("1000001");
    }

    public void userInputCallbackUrl(){
        driver.findElement(callBackUrlField).sendKeys("www.moveon.yes");
    }

    public void userCanViewThatSuccessfullyCreateChannel(){
        driver.findElement(By.xpath("//*[contains(@class,'channel_details')]"));
    }

    //ASSERTION

    public void userGetNotifChannelNameCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Channel Name cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifAccountNumberCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Account Number cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifPicEmailCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Pic Email cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifPicPhoneNumberCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Pic Phone Number cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifPicAddressCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Pic Address cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifIPWhiteListCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Ip Whitelist cannot be blank.')])[1]")).isDisplayed();
    }
    public void userGetNotifCallbackUrlDevCannotBeBlank(){
        driver.findElement(By.xpath("(//*[contains(text(),'Callback Url Dev cannot be blank.')])[1]")).isDisplayed();
    }





}
