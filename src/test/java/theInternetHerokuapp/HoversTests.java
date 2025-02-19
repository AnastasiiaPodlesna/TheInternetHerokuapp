package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.FramesPage;
import theInternetHerokuapp.pages.HomePage;
import theInternetHerokuapp.pages.HoversPage;

public class HoversTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).clickHoversLink();
    }

    @Test
    public void HoversPositiveTest() {

        new HoversPage(app.driver, app.wait)
                .moveCursorToUser("name: user2");
    }
}
