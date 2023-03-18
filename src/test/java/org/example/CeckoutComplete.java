package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CeckoutComplete {
    public WebDriver driver;
    public CeckoutComplete (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }




    public void ThankYou() {
        WebElement query = driver.findElement(By.xpath("//*[text()='Thank you for your order!']"));
        //WebElement query = driver.findElement(By.xpath("//*[normalize-space(text())=’Thank you for your order!’]"));

    }
    public void URL(String URL){
        String currentURL= driver.getCurrentUrl();
        Assertions.assertEquals(URL,currentURL,"Адрес на странице не совпадает");
    }
}
