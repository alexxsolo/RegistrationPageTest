package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    //locators
    SelenideElement firstNameInput = $("#firstName");

    //actions
    public void setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }
}

