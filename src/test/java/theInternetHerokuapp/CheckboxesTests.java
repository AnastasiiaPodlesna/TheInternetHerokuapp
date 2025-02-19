package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.CheckboxesPage;
import theInternetHerokuapp.pages.HomePage;

public class CheckboxesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).checkboxes();
    }

    @Test
    public void printCheckboxPositiveTest() {
        new CheckboxesPage(app.driver, app.wait)
                .printCheckBox();
    }

    @Test
    public void selectCheckboxByTextPositiveTest() {
        String checkBoxName = "checkbox 1";
        new CheckboxesPage(app.driver, app.wait)
                .selectCheckboxByText(checkBoxName)
                .verifyCheckbox(checkBoxName);
    }

    @Test
    public void selectCheckboxByTextWithActionPositiveTest() {
        String checkBoxName = "checkbox 1";
        new CheckboxesPage(app.driver, app.wait)
                .selectCheckboxByTextWithActions(checkBoxName)
                .verifyCheckbox(checkBoxName);
    }

    @Test
    public void selectCheckboxByTextWithRobotPositiveTest(){
        String checkBoxName = "checkbox 1";
        new CheckboxesPage(app.driver,app.wait)
                .selectCheckboxByTextWithRobot(checkBoxName)
                .verifyCheckbox(checkBoxName)
        ;
    }
}
