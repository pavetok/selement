package com.pavetok.selement.actors;

import com.pavetok.selement.Selement;
import com.pavetok.selement.pages.BasePage;
import com.pavetok.selement.pages.MainPage;

public class User {

    private BasePage currentPage;

    public void shouldSee(Selement selement) throws Exception {
        selement.shouldBePresented();
    }

    public String name() {
        return "user@yandex.ru";
    }

    public String password() {
        return "qwerty";
    }

    public void login() {
        MainPage mainPage = (MainPage)currentPage;
        mainPage.mailForm().login(name(), password());
    }

    public void opens(BasePage page) {
        currentPage = page;
    }
}
