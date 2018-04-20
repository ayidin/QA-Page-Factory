import org.openqa.selenium.By;

public class LoginPage {
    private static String nameUser = "._1vp5";


    public static String getUserName(){
        String name = BrowserManager.browser.findElement(By.cssSelector(nameUser)).getText();
        return name;
    }

}
