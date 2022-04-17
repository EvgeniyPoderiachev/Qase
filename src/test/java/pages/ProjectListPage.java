package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class ProjectListPage extends BasePage {

    public SelenideElement createButton = $("#createButton");

    public ProjectListPage() {
    }

    public void NewProjectButton() {
        createButton.click();
    }
}
