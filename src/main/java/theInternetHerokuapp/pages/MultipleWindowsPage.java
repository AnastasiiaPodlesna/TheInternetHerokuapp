package theInternetHerokuapp.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import theInternetHerokuapp.core.BasePage;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement clickHereLink;

    @FindBy(css = "h1, h2, h3, h4, h5, h6")
    List<WebElement> headings;

    public MultipleWindowsPage switchToOtherTab() {

        String startWindow = driver.getWindowHandle(); // стартовая страница
        List<String> startPageHeadings = getHeadingPage(headings);// заголовки стартовой страницы

        System.out.println("-------------------------------------------------------");
        System.out.println("Headings start page: " + startPageHeadings);
        System.out.println("Start Page Title: " + driver.switchTo().window(startWindow).getTitle()); // титл
        System.out.println("Start Page URL: " + driver.switchTo().window(startWindow).getCurrentUrl());

        click(clickHereLink); // клик по ссылке Click Here, открытие новой вкладки

        //Set<String> allNewWindows = driver.getWindowHandles(); // новые вкладки
        List<String> CurrentPageHeadings = getHeadingPage(headings);

        wait.until(d -> driver.getWindowHandles().size() > 1); // ждем появления нов.вкладки

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(startWindow)) {
                driver.switchTo().window(window);  // Переключаемся на новое окно
                break;
            }
        }
        // проверяем заголовки
        System.out.println("-------------------------------------------------------");
        System.out.println("Headings current page: " + CurrentPageHeadings);
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Current Page Title: " + driver.getTitle());

        return this;
    }
}
