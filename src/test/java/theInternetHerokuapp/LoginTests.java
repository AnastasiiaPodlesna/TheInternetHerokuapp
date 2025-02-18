package theInternetHerokuapp;

import core.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import theInternetHerokuapp.pages.HomePage;
import theInternetHerokuapp.pages.LoginPage;
import theInternetHerokuapp.utils.DataProviders;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).formAuthentication();
    }

    @Test
    public void loginPositiveTest(){
        new LoginPage(app.driver,app.wait)
                .enterLoginData("tomsmith","SuperSecretPassword!")
                .clickOnLoginButton()
                .verifyLogoutButtonVisible();
    }

    @Test(dataProvider = "loginDataPositiveProvider", dataProviderClass = DataProviders.class)
    public void loginProviderPositiveTest (String username, String password) {
        new LoginPage(app.driver, app.wait)
                .enterLoginData(username, password)
                .clickOnLoginButton()
                .verifyLogoutButtonVisible();
    }


    @Test(dataProvider = "loginDataNegativeProvider", dataProviderClass = DataProviders.class)
    public void loginProviderNegativeTest (String username, String password) {
        new LoginPage(app.driver, app.wait)
                .enterLoginData(username, password)
                .clickOnLoginButton()
                .verifyLoginButtonVisible();
    }

}
