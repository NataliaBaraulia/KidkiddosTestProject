import Pages.CartPage;
import Pages.ProductPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class CartPageTest extends UseCaseBase {
    private static CartPage cartPage;

    @BeforeAll
    public static void classSetup() {
        cartPage = new CartPage();
    }
    @BeforeEach
    public void beforeTest(){
        cartPage.navigateToProductPage();}
    @Test
    public void cartButtonExists(){
        boolean success = cartPage.isCartButtonVisible();
        assertTrue(success);
    }
    @Test
    public void openCart(){
        cartPage.cartButton().click();
        String expectedURL = "https://kidkiddos.com/cart";
        String actualURL = cartPage.currentURL();
        assertEquals(expectedURL, actualURL);
    }
    @Test
    public void quantityFieldExists(){
        cartPage.cartButton().click();
        WebElement element = cartPage.quantityField();
        assertNotNull(element);
    }
    @Test
    public void changeQuantity(){
        cartPage.cartButton().click();
        cartPage.setQuantity();
        String fieldValueAfterIncrease = cartPage.quantityField().getAttribute("value");
        assertEquals("6", fieldValueAfterIncrease, "The quantity field was not set to '6' successfully");

    }
    @Test
    public void updateButtonExists(){
        cartPage.cartButton().click();
        WebElement element = cartPage.updateButton();
        assertNotNull(element);
    }
    @Test
    public void priceBoxExists(){}

    @Test
    public void changeQuantityAndUpdate(){
        cartPage.cartButton().click();
        cartPage.setQuantityAndUpdate();
        String fieldValueAfterIncrease = cartPage.quantityField().getAttribute("value");
        assertEquals("6", fieldValueAfterIncrease, "The quantity field was not set to '6' successfully");
        WebElement price = cartPage.priceBox();
        assertNotNull(price);









    }



}
