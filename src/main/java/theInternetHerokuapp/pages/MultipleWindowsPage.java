package theInternetHerokuapp.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import theInternetHerokuapp.core.BasePage;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
}
