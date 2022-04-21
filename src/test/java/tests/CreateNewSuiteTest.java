package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CreateNewSuiteTest extends BaseTest {

    @Test
    public void NewSuite() {
        open("login");
        loginPage.login("setminsk@gmail.com", "*QPiE@T9_BTQg4C");
        projectListPage.NewProjectButton();
        newProjectPage.newProjectInputs("TestD Application", "MWDD","Project for my homeworkD");
        repositoryPage.RepositoryPageInputs("Test suite","Test", "Test2");
    }

}
