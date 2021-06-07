package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id ="pass" )
    public  WebElement pass;

    @FindBy(name = "login")
    public WebElement login;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMessage;


}


