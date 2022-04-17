package tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
public class LoginTest extends BaseTest {

    @Test
    public void login() {
        open("login");
        loginPage.login("setminsk@gmail.com", "*QPiE@T9_BTQg4C");
    }
}
