package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerJSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By result = By.id("result");

    public JavaScriptAlertsPage (WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerJSAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }
}
