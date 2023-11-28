package Pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{

    public static final String AMANDA_BOOK_URL = "https://kidkiddos.com/collections/english-only/products/amandas-dream-childrens-picture-book-english-only?variant=31413879308346";
    public static final String BOOK_FORMAT_SELECTOR= "//select[@id ='SingleOptionSelector-0']";
    public static final String HARDCOVER = "//option[@value ='Hardcover']";
    public static final String QUANTITY = "//input[@id ='Quantity']";
    public static final String QUANTITY_INCREASE_BUTTON = "//form[@action ='/cart/add']";

    public void navigateToProductPage(){
        webDriver.get(AMANDA_BOOK_URL);
    }
    public WebElement formatSelector(){
        return findElementByXpath(BOOK_FORMAT_SELECTOR);
    }
    public WebElement hardcoverFormat(){
        return findElementByXpath(HARDCOVER);
    }
    public WebElement quantityField(){
        return findElementByXpath(QUANTITY);
    }
    public WebElement increaseButton(){
        return findElementByXpath(QUANTITY_INCREASE_BUTTON);
    }
    public void setQuantity(){
      changeValue("5", QUANTITY);
    }

}
