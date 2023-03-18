package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabs {
    public WebDriver driver;
    public SwagLabs (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy (xpath = "//*[@id=\"first-name\"]")
    private WebElement InFName;
    @FindBy (xpath = "//*[@id=\"last-name\"]")
    private WebElement InLName;
    @FindBy (xpath = "//*[@id=\"postal-code\"]")
    private WebElement InZPCode;

    @FindBy (xpath = "//*[@id=\"continue\"]")
    private WebElement ContBtn;
    public void inputFName(String FName) {
        InFName.sendKeys(FName);}
    public void inputLName(String LName) {
        InLName.sendKeys(LName); }
    public void inputZPCode(String ZPCode) {
        InZPCode.sendKeys(ZPCode); }
    public void ClickContBtn() {
        ContBtn.click(); }
}
