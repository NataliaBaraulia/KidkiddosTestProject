import Pages.BooksResultsPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


import static org.junit.jupiter.api.Assertions.*;

public class BooksResultsPageTest extends UseCaseBase {

    private static BooksResultsPage booksResultsPage;
    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup() {
        booksResultsPage = new BooksResultsPage();
        mainPage = new MainPage();
    }
    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToMainPage();}

    @Test
    public void dropDownMenuBooksByLanguage(){
        boolean success = booksResultsPage.isBooksByLanguageVisible();
        assertTrue(success);
    }
    @Test
    public void englishOnlyBooksChoice(){
        booksResultsPage.booksByLanguageOption().click();
        WebElement englishOption = booksResultsPage.englishOnlyBooks();
        assertNotNull(englishOption);
        englishOption.click();
        WebElement engHeader = booksResultsPage.englishHeader();
        assertNotNull(engHeader);
    }
    @Test
    public void bookChoice(){
        booksResultsPage.booksByLanguageOption().click();
        booksResultsPage.englishOnlyBooks().click();

        WebElement book = booksResultsPage.amadnasDreamBook();
        assertNotNull(book);
        book.click();
        WebElement selector = booksResultsPage.formatSelector();
        assertNotNull(selector);
    }









}
