package com.pavetok.selement.pages;

import com.pavetok.selement.Child;
import com.pavetok.selement.elements.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPage extends AbstractPage {

    @Child
    @Autowired
    public SearchForm searchForm;

    @Override
    protected String pageUrl() {
        return "https://www.google.ru";
    }
}
