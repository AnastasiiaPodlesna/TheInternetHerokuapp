package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.FramesPage;
import theInternetHerokuapp.pages.HomePage;
import theInternetHerokuapp.utils.DataProviders;

public class FramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).nestedFrames();
    }

    @Test
    public void framePositiveTest() {
        new FramesPage(app.driver, app.wait)
                .getListOfFrames();
    }

    @Test
    public void switchToFramePositiveTest() {
        new FramesPage(app.driver, app.wait)
                .switchToFrameByFrameName("frame_top","frame-right")
                .verifyIFrameText("RIGHT");
    }

    @Test (dataProvider = "framesNamePositiveProvider", dataProviderClass = DataProviders.class)
    public void framesNamePositiveProviderTest(String parentFrameName, String childFrameName, String frameText) {
        new FramesPage(app.driver, app.wait)
                .switchToFrameByFrameName(parentFrameName, childFrameName)
                .verifyIFrameText(frameText);
    }
}
