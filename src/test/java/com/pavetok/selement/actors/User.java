package com.pavetok.selement.actors;

import com.pavetok.selement.Selement;
import com.pavetok.selement.pages.BasePage;
import com.pavetok.selement.pages.MainPage;

public class User {

    private BasePage currentPage;

    public void shouldSee(Selement selement) throws Exception {
        selement.shouldBePresented();
    }

    public void search(String query) {
        MainPage mainPage = (MainPage)currentPage; // TODO: is it ugly?
        mainPage.searchForm.search(query);
    }

    public void opens(BasePage page) {
        currentPage = page;
    }
}
