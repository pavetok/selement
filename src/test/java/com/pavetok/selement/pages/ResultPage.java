package com.pavetok.selement.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.visible;

public class ResultPage extends AbstractPage {
    @Override
    protected String pageUrl() {
        return "https://www.google.ru";
    }

    @Override
    protected void shouldBeVisible() {
        super.shouldBeVisible();
        results().shouldHaveSize(10);
        next().shouldBe(visible);
    }

    public ElementsCollection results() {
        return $$(".rc");
    }

    public SelenideElement next() {
        return $(By.id("pnnext"));
    }
}
