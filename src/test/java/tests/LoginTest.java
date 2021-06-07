package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;


public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        driver= Driver.getDriver("chrome");
        loginPage=new LoginPage(driver);

    }

    @Test
    public void loginTest() {
        driver.get("https://www.facebook.com/");
        loginPage.email.sendKeys("Vovita" );
        loginPage.pass.sendKeys("admin123");
        loginPage.login.click();


        String errorMessage = loginPage.errorMessage.getText();

        System.out.println(errorMessage);

        Assert.assertEquals(errorMessage,
                "The email or mobile number you entered isn’t connected to an account. ");


    }
}













