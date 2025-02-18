package theInternetHerokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import theInternetHerokuapp.core.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "a[href='/login']")
    WebElement formAuthenticationLink;

    public LoginPage formAuthentication() {
        clickWithJS(formAuthenticationLink, 0, 500);
        return new LoginPage(driver, wait);
    }

    @FindBy(xpath = "//a[@href='/nested_frames']")
    WebElement nested_frames;

    public FramesPage nestedFrames() {
        click(nested_frames);
        return new FramesPage(driver, wait);
    }
}
