package com.pavetok.selement.actors;

import com.pavetok.selement.Selement;
import com.pavetok.selement.pages.BasePage;
import com.pavetok.selement.pages.MainPage;

public class User {

    private String email;
    private String password;

    private BasePage currentPage;

    public User() {
        this.email = "user@yandex.ru";
        this.password = "qwerty";
    }

    public void shouldSee(Selement selement) throws Exception {
        selement.shouldBePresented();
    }

    public void login() {
        MainPage mainPage = (MainPage)currentPage; // TODO: is it ugly?
        mainPage.mailForm.login(email, password);
    }

    public void opens(BasePage page) {
        currentPage = page;
    }
}
