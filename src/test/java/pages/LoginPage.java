package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $("#inputEmail");
    public SelenideElement passwordField = $("#inputPassword");
    public SelenideElement signInButton = $("#btnLogin");

    public LoginPage() {
    }

    public void login(String email, String password) {
        loginField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
        $("#createButton").shouldBe(Condition.visible);
    }
}

