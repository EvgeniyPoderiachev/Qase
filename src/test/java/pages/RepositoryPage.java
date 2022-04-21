package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage extends BasePage {

    public SelenideElement createSuiteButton = $("#create-suite-button");
    public SelenideElement suiteName = $("#name");
    public SelenideElement description = $("#description");
    public SelenideElement preconditions = $("#preconditions");
    public SelenideElement saveSuiteButton = $("#save-suite-button");

    public RepositoryPage() {
    }

    public void RepositoryPageInputs(String suite_name, String description_input, String preconditions_input) {
        createSuiteButton.click();
        suiteName.sendKeys(suite_name);
        description.sendKeys(description_input);
        preconditions.sendKeys(preconditions_input);
        saveSuiteButton.click();
    }
}
