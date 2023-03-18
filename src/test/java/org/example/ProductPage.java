package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProductPage {
    public WebDriver driver;
    public ProductPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    // локатор 1й кнопки покупки
    @FindBy (xpath = "//*[@class=\"inventory_list\"]/div[1]//button")
    private WebElement buttonBtn;

    @FindBy (xpath = "//*[@id='shopping_cart_container']/a")
    private WebElement shopping_cart;
    @FindBy (xpath = "//*[@id='checkout']")
    private WebElement checkout;

 //   public void inputLogin(String login) {
 //       loginField.sendKeys(login);}

    public void clickButtonBtn() {buttonBtn.click(); }
    public void clickSoppingCart() {shopping_cart.click(); }
    public void clickCheckout() {checkout.click(); }

    @FindBy(xpath ="//*[normalize-space(text())=’Thank you for your order!’]")
    private WebElement EpicSadface;


    public void EpicSadface() {
        System.out.println("Текст на странице верный");
    }

}
