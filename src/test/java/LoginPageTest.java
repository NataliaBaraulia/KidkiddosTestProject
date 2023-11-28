import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.openqa.selenium.WebElement;
import java.util.stream.Stream;



import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends UseCaseBase {

    private static LoginPage loginPage;
    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup(){

        loginPage = new LoginPage();
        mainPage = new MainPage();
    }
    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();
        mainPage.openLoginPage();}

    @Test
    public void openLoginPage(){
        LoginPage loginPage = mainPage.openLoginPage();
        boolean isLoaded = loginPage.isLoginIconVisible();
        assertTrue(isLoaded);}
//    @Test
//    public void notARobot(){
//        loginPage.signInButtonElement();
//        WebElement robotCheck = loginPage.notARobotCheck();
//        assertNotNull(robotCheck);
//    }

    @Test
    public void errorMessage(){
        loginPage.signInButtonElement();
        Boolean message = loginPage.incorrectEmailOrPassword();
        assertNotNull(message);
    }
    @ParameterizedTest
    @MethodSource("inputTestData")
    public void invalidLoginCredentials(String email, String password){

      WebElement emailElement = loginPage.emailFieldInput();
      assertNotNull(emailElement);
      emailElement.click();
      emailElement.sendKeys(email);

      WebElement passwordElement = loginPage.passwordFieldInput();
        assertNotNull(passwordElement);
        passwordElement.click();
        passwordElement.sendKeys(password);

        loginPage.signInButtonElement().click();
        Boolean message = loginPage.incorrectEmailOrPassword();
        assertNotNull(message);
    }
    public static Stream<Arguments> inputTestData() {
        return Stream.of(
                Arguments.of("Naaaaattttttaaaaaaaaaliiiiia@","jljjj"),
                Arguments.of("Natalia", "invalid-email"));
    }


}
