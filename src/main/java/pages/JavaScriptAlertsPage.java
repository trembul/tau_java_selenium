package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerJSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage (WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerJSAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerJSConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerJSPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToCancel(){
        driver.switchTo().alert().dismiss();
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }

    public String alert_getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
