package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginPage extends BasePage{
    public static final String LOGIN_HEADER = "//h1[text() = 'Login']";
    private static final String SIGN_IN_BUTTON = "//input[@value = 'Sign In']";
    private static final String INCORRECT_CREDENTIALS = "//*[text() ='Incorrect email or password.']";
    private static final String EMAIL = "//input[@id = 'CustomerEmail']";
    private static final String PASSWORD = "//input[@id = 'CustomerPassword']";
    private static final String ERROR_MESSAGE = "//*[contains(text(), 'Please')]";

public boolean isLoginIconVisible(){
    return elementExists(LOGIN_HEADER);
}
public WebElement signInButtonElement(){
    return findElementByXpath(SIGN_IN_BUTTON);

}
public boolean incorrectEmailOrPassword(){
    Boolean isExist = elementExists(INCORRECT_CREDENTIALS);
    return isExist;

}
public WebElement emailFieldInput(){
    return findElementByXpath(EMAIL);

}
public WebElement passwordFieldInput(){
        return findElementByXpath(PASSWORD);

}
public String currentURL(){
    getCurrentURL();
    return currentURL();
}
public WebElement errMessage(){
    return findVisibleElementByXpath(ERROR_MESSAGE);

}


}
