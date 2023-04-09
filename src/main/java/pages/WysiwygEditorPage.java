package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector(("button[title|=\"Increase indent\"]"));

    public WysiwygEditorPage(WebDriver driver) {
        this.driver= driver;
    }

    public void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearEditArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void sendText(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndention(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromIframe(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


}
