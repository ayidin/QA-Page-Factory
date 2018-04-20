import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static MainPage mainPage(){
        BrowserManager.browser.get("https://www.facebook.com/");
        return PageFactory.initElements(BrowserManager.browser, MainPage.class);
    }
}
