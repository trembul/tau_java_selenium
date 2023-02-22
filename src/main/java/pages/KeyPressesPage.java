package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {

    public WebDriver driver;
    private By inputField = By.id("target");
    private By alertText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver=driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getAlertText(){
        return driver.findElement(alertText).getText();
    }
}
