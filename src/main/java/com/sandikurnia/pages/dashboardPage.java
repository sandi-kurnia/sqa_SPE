package com.sandikurnia.pages;

import com.sandikurnia.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class dashboardPage extends testBase {

    //DEFINE ELEMENT LOCATOR
    By dashboardMenuBtn = By.xpath("/descendant::a[text()=' Dashboard']");
    By chartlineBtn = By.xpath("//*[contains(@class,'chartic-line')]");
    By chartBarBtn = By.xpath("//*[contains(@class,'chartic-col')]");
    By dropDownButton = By.xpath("/descendant::button[text()='2021']");
    By yearsOfCharTransaction = By.xpath("/descendant::a[text()='2020']");
    By dropDownloadChartBtn = By.xpath("/descendant::button[text()=' Download chart']");
    By pngBtn = By.xpath("//*[contains(@data-type,'image/png')]");
    By jpgBtn = By.xpath("//*[contains(@data-type,'image/jpeg')]");

    By startDateBtn = By.id("start_date");
    By endDateBtn = By.id("end_date");


    // ----------------------------- METHOD ----------------------------- \\

    public void userClickDashBoardMenu() {
        driver.findElement(dashboardMenuBtn).click();
    }

    public void userClickCharWithLineBtn() {
        driver.findElement(chartlineBtn).click();
    }

    public void userClickChartBarBtn() {
        driver.findElement(chartBarBtn).click();
    }

    public void userClickDropDownButton() {
        driver.findElement(dropDownButton).click();
    }

    public void userClickYearsOfCharTransaction() {
        driver.findElement(yearsOfCharTransaction).click();
    }

    public void userClickDropDownDownloadChart() {
        driver.findElement(dropDownloadChartBtn).click();
    }

    public void userClickPNGTypeButton() {
        driver.findElement(pngBtn).click();
    }

    public void userClickJPGTypeButton() {
        driver.findElement(jpgBtn).click();
    }

    public void userClickStartDateBtn() {
        driver.findElement(startDateBtn).click();
    }

    public void userPickAYearToStartDate() {
        WebElement yearSelection = driver.findElement(By.className("picker__select--year"));
        Select select = new Select(yearSelection);
        select.selectByVisibleText("2020");
    }

    public void userPickAMonthToStartDate() {
        WebElement monthSelection = driver.findElement(By.className("picker__select--month"));
        Select select = new Select(monthSelection);
        select.selectByVisibleText("May");
    }

    public void userPickADateToStartDate() {
        List<WebElement> daysElement = driver.findElements(By.xpath("//*[contains(@class,'picker__day picker__day--infocus')]"));
        for (WebElement date : daysElement) {

            if (date.getText().equals("12")) {
                date.click();
                date.click();
                return;
            }
        }
    }

    public void userClickEndDateBtn() throws Exception {
        driver.findElement(endDateBtn).click();
        Thread.sleep(3000);
    }

    public void userPickADateToEndDate() {
        driver.findElement(By.xpath("(//*[contains(@class,'picker__footer')]/button)[4]")).click();
    }

    public void dataIsShowing() {
        driver.findElement(By.xpath("//*[contains(text(),'Super Admin')]")).isDisplayed();
    }

    public void userPickInvalidAYearToStartDate() {
        WebElement yearSelection = driver.findElement(By.className("picker__select--year"));
        Select select = new Select(yearSelection);
        select.selectByVisibleText("2027");
    }

    public void userPickInvalidAMonthToStartDate() {
        WebElement monthSelection = driver.findElement(By.className("picker__select--month"));
        Select select = new Select(monthSelection);
        select.selectByVisibleText("August");
    }

    public void userPickInvalidADateToStartDate() {
        List<WebElement> daysElement = driver.findElements(By.xpath("//*[contains(@class,'picker__day picker__day--infocus')]"));
        for (WebElement date : daysElement) {

            if (date.getText().equals("8")) {
                date.click();
                date.click();
                return;
            }
        }
    }

    public void showingAlertPopUpWindow()throws Exception{
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
}

