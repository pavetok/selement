package com.pavetok.selement.actors;

import com.pavetok.selement.Selement;
import com.pavetok.selement.elements.SearchForm;
import com.pavetok.selement.pages.BasePage;
import org.springframework.beans.factory.annotation.Autowired;

public class User {
    @Autowired
    private Browser browser;
    @Autowired
    private SearchForm searchForm;

    public void opens(BasePage page) throws Exception {
        browser.opens(page);
        shouldSee(page);
    }

    public void shouldSee(Selement element) throws Exception {
        element.shouldBeVisible();
    }

    public void shouldSee(Selement... elements) throws Exception {
        for (Selement element : elements) {
            shouldSee(element);
        }
    }

    public void searches(String query) {
        searchForm.search(query);
    }
}
