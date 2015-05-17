package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;

public class Result extends Selement {
    private String linkText;
    private String description;

    public Result(String linkText, String description) {
        this.linkText = linkText;
        this.description = description;
    }

    @Override
    protected By locator() {
        return By.className("rc");
    }

    @Override
    protected void visible() {
        super.visible();
        this.link().shouldBe(visible);
        this.description().shouldBe(visible);
    }

    private SelenideElement link() {
        String locator = String.format("//a[text()='%s']", linkText);
        return self().$(By.xpath(locator));
    }

    private SelenideElement description() {
        String locator = String.format("//span[contains(text(), '%s')]", description);
        return self().$(By.xpath(locator));
    }
}
