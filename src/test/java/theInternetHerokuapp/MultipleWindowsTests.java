package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.HomePage;
import theInternetHerokuapp.pages.MultipleWindowsPage;

public class MultipleWindowsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).multipleWindows();
    }

    @Test
    public void multipleWindowsPositiveTest(){
        new MultipleWindowsPage(app.driver, app.wait)
                .clickByClickHereAndSwitchNewTab()
                .verifySwitching()
                .switchToStartPage()

        ;

    }

}
