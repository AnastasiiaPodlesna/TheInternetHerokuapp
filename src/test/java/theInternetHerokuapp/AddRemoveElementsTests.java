package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.AddRemoveElementsPage;
import theInternetHerokuapp.pages.HomePage;

public class AddRemoveElementsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).addRemoveElements();
    }

    @Test
    public void addRemoveElementsPositiveTest() {
        new AddRemoveElementsPage(app.driver, app.wait)
                .clickAddElementButtonAndCheckAddability(2)
                .clickDeleteButtonsAndCheckDeletability();
    }

}
