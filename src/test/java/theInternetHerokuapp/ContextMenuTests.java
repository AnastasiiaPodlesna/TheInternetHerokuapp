package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.ContextMenuPage;
import theInternetHerokuapp.pages.HomePage;

public class ContextMenuTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).contextMenu();
    }

    @Test
    public void rightClickOnBoxAndAlertPositiveTest(){
        new ContextMenuPage(app.driver,app.wait)
                .rightClickOnBox()
                .verifyAlertText("You");
    }

}
