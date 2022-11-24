
package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

//import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;




// только success test
public class PracticeFormTest {

    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Alex";
    String lastName = "Solo";
    String userEmail = "solo@awg.ru";
    String userGender = "Male";
    String userNumber = "9999999999";
    String userDay = "06";
    String userMonth = "October";
    String userYear = "2000";
    String subject = "Computer Science";
    String hobby = "Reading";
    String testImg = "testImg.jpg";
    String currentAddress = "City Street House";
    String state = "Haryana";
    String city = "Karnal";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setNumber(userNumber)
                .setBirthDay(userDay, userMonth, userYear)
                .setSubject(subject)
                .setHobby(hobby)
                .setTestImg(testImg)
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit();


        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(userEmail), text(userNumber), text(userDay + " " + userMonth + "," + userYear), text(testImg), text(hobby),
                text(currentAddress), text(state + " " + city));
    }
}



