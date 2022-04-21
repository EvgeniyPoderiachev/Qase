package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class NewProjectPage extends BasePage {

    public SelenideElement projectName = $("#inputTitle");
    public SelenideElement projectCode = $("#inputCode");
    public SelenideElement descriptionInput = $("#inputDescription");
    public SelenideElement projectAccessType = $("#private-access-type");
    public SelenideElement membersAccess = $("#accessAll");
    public SelenideElement submitButton = $("[type=submit]");

    public NewProjectPage() {
    }

    public void newProjectInputs(String project_name, String project_code, String description) {
        projectName.sendKeys(project_name);
        projectCode.sendKeys(project_code);
        descriptionInput.sendKeys(description);
        projectAccessType.click();
        membersAccess.click();
        submitButton.click();
    }
}
