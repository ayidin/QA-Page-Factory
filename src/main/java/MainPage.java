import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (css = "#email")
    WebElement inputEmailField;

    @FindBy (css = "#pass")
    WebElement inputPassField;

    @FindBy(css = "input[type=submit]")
    WebElement buttonSubmit;

    private static final String FACEBOOK_LOGIN = "......";
    private static final String FACEBOOK_PASS = ".......";

    public LoginPage loginPage(){
        inputEmailField.sendKeys(FACEBOOK_LOGIN);
        inputPassField.sendKeys(FACEBOOK_PASS);
        buttonSubmit.click();
        return PageFactory.initElements(BrowserManager.browser, LoginPage.class);
    }
}
