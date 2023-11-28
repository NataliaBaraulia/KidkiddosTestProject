import Pages.ProductPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class ProductPageTest extends UseCaseBase {


    private static ProductPage productPage;
    @BeforeAll
    public static void classSetup() {
        productPage = new ProductPage();
    }
    @BeforeEach
    public void beforeTest(){
        productPage.navigateToProductPage();
    }
    @Test
    public void changeBookFormat(){
        productPage.formatSelector().click();
        WebElement element = productPage.hardcoverFormat();
        assertNotNull(element);
        element.click();
    }
    @Test
    public void changeQuantity(){
        WebElement element = productPage.quantityField();
        assertNotNull(element);
        productPage.setQuantity();
        String fieldValueAfterIncrease = productPage.quantityField().getAttribute("value");
        assertEquals("5", fieldValueAfterIncrease, "The quantity field was not set to '5' successfully");

    }
}
