package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBox(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(box)).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void clickToConfirm(){
        driver.switchTo().alert().accept();
    }
}
