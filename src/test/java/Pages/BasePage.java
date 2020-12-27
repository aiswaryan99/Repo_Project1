package Pages;

import DriverWrapper.Web;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebElement findElementUsingFluentWait(By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        clickThis(locator);
    }

    public void typeText(By locator, String data) {
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public void implicitWait(int seconds){
        Web.getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public String getTextValue(By locator){
        return findElementUsingFluentWait(locator).getText();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,200);");
    }

    public void scrollMiddle(){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,300);");
    }

    public void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,-700);");
    }

    public void isElementDisplayed(By locator){
        findElementUsingFluentWait(locator).isDisplayed();
    }

    public void clickIfOnlyDisplayed(By locator){
        if(findElementUsingFluentWait(locator).isDisplayed()){
            findElementUsingFluentWait(locator).click();
        }
    }

    public void clickFromDropdown(By locator, String data){
        clickThis(locator);
        WebElement number = Web.getDriver().findElement(locator);
        Select n = new Select(number);
        n.selectByVisibleText(data);
    }

    public void selectFromSuggestions(By locator,String data){
        List<WebElement> suggestions = Web.getDriver().findElements(locator);
        for(WebElement s: suggestions){
            String text = s.getText();
            if(text.equalsIgnoreCase(data)){
                WebDriverWait wait = new WebDriverWait(Web.getDriver(),30);
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                s.click();
                break;
            }
        }
    }

    public void hoverOver(By locator){
        WebElement element = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).build().perform();
    }






}