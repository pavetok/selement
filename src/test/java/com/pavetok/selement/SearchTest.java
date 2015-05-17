package com.pavetok.selement;

import com.pavetok.selement.actors.Browser;
import com.pavetok.selement.actors.User;
import com.pavetok.selement.elements.Result;
import com.pavetok.selement.pages.MainPage;
import com.pavetok.selement.pages.ResultPage;
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
    private MainPage mainPage;
    @Autowired
    private ResultPage resultPage;
    @Autowired
    private Browser browser;
    @Autowired
    private User user;

    @BeforeClass
    public static void suiteSetup() {
        open("http://www.google.com");
    }

    @Test
    public void searchShouldWork() throws Exception {
        // given
        Result result1 = new Result(1, "Selenide: лаконичные UI тесты на Java", "позволяет писать лаконичные тесты");
        Result result2 = new Result(2, "Selenide: concise UI tests in Java", "concise UI tests in Java");
        // when
        user.opens(mainPage);
        // and
        user.searches("selenide");
        // then
        browser.opens(resultPage);
        // and
        resultPage.resultList().shouldHaveSize(10);
        // and
        user.shouldSee(result1, result2);
    }
}
