package utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserUtils {

        static  WebDriverWait wait;
        public static void clickElement(WebElement element){
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        public static void sendMessage(WebElement element, String text){
            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
        }
    }




