package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By counter = By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");


    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCounter(){
        return (driver.findElement(counter).getText());
    }

    public void moveSlider(String value){
        while (!getCounter().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
