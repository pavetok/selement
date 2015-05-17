package com.pavetok.selement.actors;

import com.pavetok.selement.pages.BasePage;

public class Browser {
    public BasePage currentPage;

    public void opens(BasePage page) {
        currentPage = page;
    }
}
