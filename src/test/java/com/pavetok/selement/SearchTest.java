package com.pavetok.selement;

import com.pavetok.selement.actors.User;
import com.pavetok.selement.pages.ResultPage;
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
public class SearchTest {

    @Autowired
    MainPage mainPage;
    @Autowired
    ResultPage resultPage;

    @BeforeClass
    public static void suiteSetup() {
        open("http://www.google.com");
    }

    @Test
    public void searchShouldWork() throws Exception {
        // given
        User user = new User();
        // when
        user.opens(mainPage);
        // then
        user.shouldSee(mainPage);
        // when
        user.search("selenide");
        // then
        user.shouldSee(resultPage);
    }
}
