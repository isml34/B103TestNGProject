


package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest1{

    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));
        TechproLoginPage techproLoginPage1 = new TechproLoginPage();
        techproLoginPage1.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        techproLoginPage1.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        techproLoginPage1.submitButton.click();



    }
}
