package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProductPage ProductPage;
    public static SwagLabs SwagLabs;
    public static WebDriver driver;
    public static CheckoutOverview CheckoutOverview;
    public static CeckoutComplete CeckoutComplete;
    @BeforeAll

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage=new LoginPage(driver);
        ProductPage=new ProductPage(driver);
        SwagLabs=new  SwagLabs(driver);
        CheckoutOverview=new CheckoutOverview(driver);
        CeckoutComplete=new CeckoutComplete(driver);
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ProductPage.clickButtonBtn();
        ProductPage.clickSoppingCart();
        ProductPage.clickCheckout();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SwagLabs.inputFName(ConfProperties.getProperty("FName"));
        SwagLabs.inputLName(ConfProperties.getProperty("LName"));
        SwagLabs.inputZPCode(ConfProperties.getProperty("ZPCode"));
        SwagLabs.ClickContBtn();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        CheckoutOverview.clickFinish();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        CeckoutComplete.URL(ConfProperties.getProperty("URL"));
        CeckoutComplete.ThankYou();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
