import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class FacebookTest {

    @BeforeTest
    public void openBrowser(){
        new BrowserManager().openBrowser();
    }

    @Test
    public void facebookTest(){
        Navigation.mainPage().loginPage();
        assertTrue(LoginPage.getUserName().contains("Alexandr"));
    }

    @AfterTest
    public void closeBrowser(){
        new BrowserManager().closeBrowser();
    }
}
