package Pages;
import Consts.Consts;

public class MainPage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop ='logo']";
    private static final String CONTACT_US_OPTION = "//a[text() ='Contact us']";
    private static final String LOGIN_PERSON_ICON = "//*[@viewBox = '0 0 28.33 37.68']";
    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);
    }
    public boolean isLogoVisible(){
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }
    public ContactUsPage openContactUsTab(){
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }
    public LoginPage openLoginPage(){
        clickElementByXpath(LOGIN_PERSON_ICON);
        return new LoginPage();
    }
}
