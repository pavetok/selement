package com.pavetok.selement.actors;

import com.pavetok.selement.pages.AbstractPage;

public class Browser {
    public AbstractPage currentPage;

    public void opens(AbstractPage page) {
        currentPage = page;
    }
}
