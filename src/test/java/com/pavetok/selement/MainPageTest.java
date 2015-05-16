package com.pavetok.selement;

import com.pavetok.selement.actors.User;
import com.pavetok.selement.pages.MailPage;
import com.pavetok.selement.pages.MainPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.codeborne.selenide.Selenide.open;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ui.xml"})
public class MainPageTest {

    @Autowired
    MainPage mainPage;
    @Autowired
    MailPage mailPage;

    @BeforeClass
    public static void suiteSetup() {
        open("http://www.yandex.ru");
    }

    @Test
    public void YandexLoginTest() throws Exception {
        // given
        User user = new User();
        // when
        user.opens(mainPage);
        // then
        user.shouldSee(mainPage);
        // when
        user.login();
        // then
        user.shouldSee(mailPage);
    }

}
