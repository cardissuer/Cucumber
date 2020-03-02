package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartBearLoginPage {

    public SmartBearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy (id = "ctl00_MainContent_status")
    public WebElement aboveBox;

}