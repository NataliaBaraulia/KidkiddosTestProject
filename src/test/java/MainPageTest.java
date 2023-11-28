import Pages.ContactUsPage;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.example.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
//    private static final Logger logger = LogManager.getLogManager().getLogger(String.valueOf(MainPageTest.class));

    @BeforeAll
    public static void classSetup(){
        mainPage = new MainPage();
    }
    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();
    }
    @Test
    public void mainPageLoadTest(){
//        logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        assertTrue(success);
    }
    @Test
    public void openContactUsPage(){
      ContactUsPage contactUsPage = mainPage.openContactUsTab();
      boolean isLoaded = contactUsPage.isPageTitleVisible();
      assertTrue(isLoaded);
    }
    @Test
    public void openLoginPage(){
        LoginPage loginPage = mainPage.openLoginPage();
        boolean isLoaded = loginPage.isLoginIconVisible();
        assertTrue(isLoaded);
    }


}
