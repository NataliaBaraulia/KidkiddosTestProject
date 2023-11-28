package Pages;

import org.openqa.selenium.WebElement;

public class BooksResultsPage extends BasePage {
    public static final String BOOKS_BY_LANGUAGE = "//a[@aria-controls ='SiteNavLabel-books-by-language']";
    public static final String ENGLISH_BOOKS = "//a[text() ='English Only']";
    public static final String ENGLISH_BOOKS_HEADER = "//h1[text() ='English Only']";
    public static final String AMADNAS_DREAM_BOOK = "//img[@data-src ='//kidkiddos.com/cdn/shop/products/childrens-motivational-bedtime-story-Amandas-Dream-cover_195x195@2x.jpg?v=1625981696']";
    public static final String BOOK_FORMAT_SELECTOR= "//select[@id ='SingleOptionSelector-0']";


public boolean isBooksByLanguageVisible(){
    return elementExists(BOOKS_BY_LANGUAGE);
}
public WebElement booksByLanguageOption(){
    return findElementByXpath(BOOKS_BY_LANGUAGE);
}
public WebElement englishOnlyBooks(){
    return findElementByXpath(ENGLISH_BOOKS);
}
public WebElement englishHeader(){
    return findElementByXpath(ENGLISH_BOOKS_HEADER);
}
public WebElement amadnasDreamBook(){
    return findElementByXpath(AMADNAS_DREAM_BOOK);
}
public WebElement formatSelector(){
    return findElementByXpath(BOOK_FORMAT_SELECTOR);
}





}