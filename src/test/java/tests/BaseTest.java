package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.LoginPage;
import pages.NewProjectPage;
import pages.ProjectListPage;

public class BaseTest {
    BasePage basePage;
    LoginPage loginPage;
    ProjectListPage projectListPage;
    NewProjectPage newProjectPage;

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://qase.io/";
        //Configuration.browser = "internet explorer";
        Configuration.headless = false;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;

        basePage = new BasePage();
        loginPage = new LoginPage();
        projectListPage = new ProjectListPage();
        newProjectPage = new NewProjectPage();
    }
}

