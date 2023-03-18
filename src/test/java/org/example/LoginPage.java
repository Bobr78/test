package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
        @FindBy (xpath = "//*[contains(@id, 'user-name')]")
        private WebElement loginField;
        @FindBy (xpath = "//*[contains(@id, 'password')]")
        private WebElement passwdField;
        @FindBy (xpath = "//*[contains(@id, 'login-button')]")
        private WebElement loginBtn;

    //@FindBy(xpath ="//*[normalize-space(text())=’Epic sadface: Username and password do not match any user in this service’]")
    //private WebElement EpicSadface;

    public void EpicSadface() {
        WebElement query = driver.findElement(By.xpath("//*[normalize-space(text())='Epic sadface: Username and password do not match any user in this service']"));
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);}
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    public void clickLoginBtn() {
        loginBtn.click(); }


}
