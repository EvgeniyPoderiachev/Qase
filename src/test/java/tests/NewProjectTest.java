package tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
public class NewProjectTest extends BaseTest {

    @Test
    public void NewProject() {
        open("login");
        loginPage.login("setminsk@gmail.com", "*QPiE@T9_BTQg4C");
        projectListPage.NewProjectButton();
        newProjectPage.newProjectInputs("TestHW Application", "MWA","Project for my homework");
    }
}
