package com.pavetok.selement.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ResultPage extends BasePage {
    @Override
    protected String url() {
        return "https://www.google.ru";
    }

    public ElementsCollection resultList() {
        return $$(".rc");
    }
}
