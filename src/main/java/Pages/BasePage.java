package Pages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class BasePage {
    private static final Logger logger = LogManager.getLogger(String.valueOf(BasePage.class));

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
    }
    protected void clickElementByXpath(String xpath){
        logger.info("Click element with xpath " + xpath);
       findElementByXpath(xpath).click();
    }
    protected void sendTextToElementByXpath(String xpath, String text){
        findElementByXpath(xpath).sendKeys(text);
    }
    protected boolean elementExists(String xpath){
        try{
            logger.info("Check element with xpath exist " + xpath);
            webDriver.findElement(By.xpath(xpath));
            return true;
        }
        catch (Exception err){
            return false;
        }
    }

     protected WebElement findElementByXpath(String xpath){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
     }
     protected WebElement findVisibleElementByXpath(String xpath){
        WebElement element;
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
         element = webDriver.findElement(By.xpath(xpath));
         return element;
     }
     protected String getCurrentURL(){
        return webDriver.getCurrentUrl();
     }
     protected void changeValue(String value, String xpath){
         Actions actions = new Actions(webDriver);
         WebElement element = webDriver.findElement(By.xpath(xpath));
         actions.moveToElement(element).click().sendKeys(Keys.BACK_SPACE).build().perform();
         actions.sendKeys(element, value).perform();
     }
    protected void changeValueAndUpdate(String value, String xpath){
        Actions actions = new Actions(webDriver);
        WebElement element = webDriver.findElement(By.xpath(xpath));
        actions.moveToElement(element).click().sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(element, value).sendKeys(Keys.ENTER).perform();
    }

}
