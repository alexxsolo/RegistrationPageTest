
package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

//import java.io.File;

// только success test
public class PracticeFormTest {

    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Alex";
    String lastName = "Solo";
    String userEmail = "solo@awg.ru";
    String userGender = "Male";
    String userNumber = "9999999999";
    String userDay = "6";
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

                .submit()

                .tableCheck(firstName)
                .tableCheck(lastName)
                .tableCheck(userEmail)
                .tableCheck(userGender)
                .tableCheck(userNumber)
                .tableCheck(userDay + " " + userMonth + "," + userYear)
                .tableCheck(subject)
                .tableCheck(hobby)
                .tableCheck(testImg)
                .tableCheck(currentAddress)
                .tableCheck(state)
                .tableCheck(city);
    }
}



