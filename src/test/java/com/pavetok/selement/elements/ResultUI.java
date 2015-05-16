package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import com.pavetok.selement.domain.Result;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;

public class ResultUI extends Selement {
    private Result domainResult;

    public ResultUI(Result domainResult) {
        this.domainResult = domainResult;
    }

    @Override
    protected By locator() {
        return By.className("rc");
    }

    @Override
    protected void presented() {
        super.presented();
        this.link().shouldBe(visible);
        this.description().shouldBe(visible);
    }

    private SelenideElement link() {
        String locator = String.format("//a[text()='%s']", domainResult.linkText());
        return self().$(By.xpath(locator));
    }

    private SelenideElement description() {
        String locator = String.format("//span[contains(text(), '%s')]", domainResult.description());
        return self().$(By.xpath(locator));
    }
}
