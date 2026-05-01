package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;   

public class ElementUtil {

    public WebDriver driver;
    public WebDriverWait webDriverWait;


    public ElementUtil(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    }


    public void click(By locator){
        waitForElementVisible(locator).click();
    }

    public void type(By locator, String text){
    WebElement element =waitForElementVisible(locator);
    element.clear();
    element.sendKeys(text);

}


    public WebElement waitForElementVisible(By locator) {
        return webDriverWait.until((ExpectedConditions.visibilityOfElementLocated(locator)));
    }

    
}


