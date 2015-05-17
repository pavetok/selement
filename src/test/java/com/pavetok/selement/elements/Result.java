package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;

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
    protected void visible() {
        self(position).shouldBe(visible);
        link().shouldBe(visible);
        description().shouldBe(visible);
    }

    private SelenideElement link() {
        return self(position).$(byText(linkText));
    }

    private SelenideElement description() {
        return self(position).$(withText(description));
    }
}
