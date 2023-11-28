package Pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public static final String AMANDA_BOOK_URL = "https://kidkiddos.com/collections/english-only/products/amandas-dream-childrens-picture-book-english-only?variant=31413879308346";
    public static final String CART_BUTTON = "//button[@id ='AddToCart-product-template']";
    public static final String CART_URL = "https://kidkiddos.com/cart";
    public static final String QUANTITY = "//input[@name='updates[]']";
    public static final String UPDATE_BUTTON = "//input[@name='update']";
    public static final String PRICE_BOX = "//span[text()='221.94']";




    public void navigateToProductPage(){
        webDriver.get(AMANDA_BOOK_URL);
    }
    public boolean isCartButtonVisible(){
        return elementExists(CART_BUTTON);
    }
    public WebElement cartButton(){
        return findElementByXpath(CART_BUTTON);
    }
    public String currentURL(){
        return getCurrentURL();

    }
    public WebElement quantityField(){
        return findElementByXpath(QUANTITY);
    }
    public void setQuantity(){
        changeValue("6", QUANTITY);
    }
    public WebElement updateButton(){
        return findElementByXpath(UPDATE_BUTTON);
    }
    public WebElement priceBox(){
        return findElementByXpath(PRICE_BOX);
    }
    public void setQuantityAndUpdate(){
        changeValueAndUpdate("6", QUANTITY);
    }


}
