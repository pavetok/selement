package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchForm extends Selement {

    @Override
    protected By locator() {
        return By.className("tsf-p");
    }

    @Override
    protected void presented() {
        super.presented();
        queryInput().shouldBe(visible);
        submitButton().shouldBe(visible);
    }

    public void search(String query) {
        queryInput().setValue(query);
        submitButton().click();
    }

    private SelenideElement queryInput() {
        return $(By.name("q"));
    }

    private SelenideElement submitButton() {
        return $(By.className("btnK"));
    }

}
