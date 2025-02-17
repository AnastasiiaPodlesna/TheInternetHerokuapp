package theInternetHerokuapp.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

        @DataProvider
        public Object[][] loginDataPositiveProvider() {
            return new Object[][]{
                    {"tomsmith", "SuperSecretPassword!"}
            };
        }

    @DataProvider
    public Object[][] loginDataNegativeProvider() {
        return new Object[][]{
                {"tomsmith", "NoSuperSecretPassword!"},
                {"smithtom", "SuperSecretPassword!"},
                {"smithtom", "NoSuperSecretPassword!"}
        };
    }

}
