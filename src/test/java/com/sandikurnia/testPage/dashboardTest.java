package com.sandikurnia.testPage;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.dashboardPage;
import com.sandikurnia.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class dashboardTest extends testBase {

    loginPage login;
    dashboardPage dashboard;
    String downloads = "/Downloads/";

    public dashboardTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        login = new loginPage();
        dashboard = new dashboardPage();
    }

    @Test(priority = 0)
    public void User_Download_The_2020_ChartLine_With_PNG_Type_Format_On_The_Dashboard_Menu()throws InterruptedException{
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickCharWithLineBtn();
        dashboard.userClickDropDownButton();
        dashboard.userClickYearsOfCharTransaction();
        dashboard.userClickDropDownDownloadChart();
        dashboard.userClickPNGTypeButton();


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
                if (fileName.matches("2020-line.png")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded jpeg is not found");
        f.deleteOnExit();

    }

    @Test(priority = 1)
    public void User_Download_The_2020_ChartLine_With_JPEG_Type_Format_On_The_Dashboard_Menu()throws InterruptedException {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickCharWithLineBtn();
        dashboard.userClickDropDownButton();
        dashboard.userClickYearsOfCharTransaction();
        dashboard.userClickDropDownDownloadChart();
        dashboard.userClickJPGTypeButton();


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
                if (fileName.matches("2020-line.jpeg")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded jpeg is not found");
        f.deleteOnExit();

    }

    @Test(priority = 2)
    public void User_Download_The_2020_ChartBar_With_PNG_Type_Format_On_The_Dashboard_Menu() throws InterruptedException {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickChartBarBtn();
        dashboard.userClickDropDownButton();
        dashboard.userClickYearsOfCharTransaction();
        dashboard.userClickDropDownDownloadChart();
        dashboard.userClickPNGTypeButton();


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
                if (fileName.matches("2020-column.png")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded jpeg is not found");
        f.deleteOnExit();
    }

    @Test(priority = 3)
    public void User_Download_The_2020_ChartBar_With_JPG_Type_Format_On_The_Dashboard_Menu() throws InterruptedException {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickChartBarBtn();
        dashboard.userClickDropDownButton();
        dashboard.userClickYearsOfCharTransaction();
        dashboard.userClickDropDownDownloadChart();
        dashboard.userClickJPGTypeButton();


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
                if (fileName.matches("2020-column.jpeg")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded jpeg is not found");
        f.deleteOnExit();
    }


    @Test(priority = 4)
    public void User_Set_Top_5_Channel_Transaction_By_Set_Valid_Start_Date_And_Valid_End_Date_On_The_Dashboard_Menu() throws Exception {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickStartDateBtn();
        dashboard.userPickAYearToStartDate();
        dashboard.userPickAMonthToStartDate();
        dashboard.userPickADateToStartDate();
        dashboard.userClickEndDateBtn();
        dashboard.userPickADateToEndDate();
        dashboard.dataIsShowing();
    }


    @Test(priority = 5)
    public void User_Set_Top_5_Channel_Transaction_By_Set_Start_Date_Exceeds_End_Date() throws Exception {
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        dashboard.userClickDashBoardMenu();
        dashboard.userClickStartDateBtn();
        dashboard.userPickInvalidAYearToStartDate();
        dashboard.userPickInvalidAMonthToStartDate();
        dashboard.userPickInvalidADateToStartDate();
        dashboard.userClickEndDateBtn();
        dashboard.userPickADateToEndDate();
        dashboard.showingAlertPopUpWindow();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
