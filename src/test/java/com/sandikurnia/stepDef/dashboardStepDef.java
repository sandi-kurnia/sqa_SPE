package com.sandikurnia.stepDef;

import com.sandikurnia.base.testBase;
import com.sandikurnia.pages.dashboardPage;
import com.sandikurnia.pages.forgotPasswordPage;
import com.sandikurnia.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.File;

public class dashboardStepDef extends testBase {

    dashboardPage dashboard;
    loginPage login;

    String downloads = "/Downloads/";

    public dashboardStepDef(){

        super();
    }


    @Given("User already to login at {string}")
    public void userAlreadyToLoginAt(String arg0) throws Exception{
        initialization();
        dashboard = new dashboardPage();
        login = new loginPage();
        login.userClickUsernameField();
        login.userInputValidUsername();
        login.userClickPasswordField();
        login.userInputValidPassword();
        login.userClickLoginBtn();
        login.userCanViewMainPageAfterSuccessLogin();
    }

    @When("User click dashboardboard menu button")
    public void userClickDashboardboardMenuButton() {
        dashboard = new dashboardPage();
        dashboard.userClickDashBoardMenu();

    }

    @And("User click chart with line")
    public void userClickChartWithLine() {
        dashboard = new dashboardPage();
        dashboard.userClickCharWithLineBtn();
    }

    @And("User click dropdown of year chart button")
    public void userClickDropdownOfYearChartButton() {
        dashboard = new dashboardPage();
        dashboard.userClickDropDownButton();
    }

    @Then("User success to log in")
    public void userSuccessToLogIn() {
    }


    @And("User click {int} years of chart transaction")
    public void userClickYearsOfChartTransaction(int arg0) {
        dashboard = new dashboardPage();
        dashboard.userClickYearsOfCharTransaction();
    }

    @And("User click dropdown download chart button")
    public void userClickDropdownDownloadChartButton() {
        dashboard = new dashboardPage();
        dashboard.userClickDropDownDownloadChart();
    }

    @And("User click png format type button")
    public void userClickPngTypeButton() {
        dashboard = new dashboardPage();
        dashboard.userClickPNGTypeButton();
    }

    @Then("User success to download 2020 chart line png format file")
    public void userSuccessToDownloadFile() throws Exception{
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

        driver.quit();
    }


    @And("User click jpeg format type button")
    public void userClickJpgFormatTypeButton() {
        dashboard = new dashboardPage();
        dashboard.userClickJPGTypeButton();
    }

    @And("User click chart with bar")
    public void userClickChartWithBar() {
        dashboard = new dashboardPage();
        dashboard.userClickChartBarBtn();
    }

    @Then("User success to download 2020 chart line jpeg format file")
    public void userSuccessToDownloadJpegFormatFile() throws InterruptedException {
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

        driver.quit();
    }

    @Then("User success to download chart bar png format file")
    public void userSuccessToDownloadChartBarPNGFormatFile() throws Exception{
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
        driver.quit();
    }

    @Then("User success to download chart bar jpeg format file")
    public void userSuccessToDownloadChartBarJpegFormatFile() throws Exception {
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
        driver.quit();
    }

    @And("User click start date button")
    public void userClickStartDateButton() {
        dashboard.userClickStartDateBtn();
    }

    @And("User pick valid start date")
    public void userPickValidStartDate() {
        dashboard.userPickAYearToStartDate();
        dashboard.userPickAMonthToStartDate();
        dashboard.userPickADateToStartDate();
    }

    @And("User click end date")
    public void userClickEndDate() throws Exception{
        dashboard.userClickEndDateBtn();
    }
    @And("User pick valid end date")
    public void userPickValidEndDate() {
        dashboard.userPickADateToEndDate();
    }

    @Then("Data is showing")
    public void dataIsShowing() {
        dashboard.dataIsShowing();
        driver.quit();
    }


    @And("User pick invalid start date")
    public void userPickInvalidStartDate() {
        dashboard.userPickInvalidAYearToStartDate();
        dashboard.userPickInvalidAMonthToStartDate();
        dashboard.userPickInvalidADateToStartDate();
    }

    @Then("showing alert pop up window {string}")
    public void showingAlertPopUpWindow(String arg0)throws Exception {
        dashboard.showingAlertPopUpWindow();
        driver.quit();
    }
}
