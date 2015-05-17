package com.pavetok.selement.actors;

import com.pavetok.selement.Selement;
import com.pavetok.selement.pages.BasePage;
import com.pavetok.selement.pages.MainPage;
import org.springframework.beans.factory.annotation.Autowired;

public class User {

    @Autowired
    Browser browser;

    public void opens(BasePage page) throws Exception {
        browser.opens(page);
        shouldSee(page);
    }

    public void shouldSee(Selement element) throws Exception {
        element.shouldBeVisible();
    }

    public void search(String query) {
        MainPage mainPage = (MainPage)browser.currentPage; // TODO: is it ugly?
        mainPage.searchForm.search(query);
    }
}
