package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class Result extends Selement {
    private final int position;
    private String linkText;
    private String description;

    public Result(int position, String linkText, String description) {
        this.position = position;
        this.linkText = linkText;
        this.description = description;
    }

    @Override
    protected By locator() {
        return By.className("rc");
    }

    @Override
    protected void shouldBeVisible() {
        self(position).shouldBe(visible);
        link().shouldBe(visible).shouldHave(exactText(linkText));
        description().shouldBe(visible).shouldHave(text(description));
    }

    private SelenideElement link() {
        return self(position).$(By.tagName("a"));
    }

    private SelenideElement description() {
        return self(position).$(By.className("st"));
    }

    @Override
    public void click() {
        link().click();
    }
}
