package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest2 {
    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeAll

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage2"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage=new LoginPage(driver);

    }
    @Test
    public void loginTest2() {
        loginPage.inputLogin(ConfProperties.getProperty("login2"));
        loginPage.inputPasswd(ConfProperties.getProperty("password2"));
        loginPage.clickLoginBtn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.EpicSadface();
    }

    @AfterAll
    public static void tearDown() {
       driver.quit();
    }
}
