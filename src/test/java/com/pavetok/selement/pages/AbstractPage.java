package com.pavetok.selement.pages;

import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

abstract public class AbstractPage extends Selement {

    protected abstract String pageUrl();

    @Override
    protected By locator() {
        return By.tagName("body");
    }

    @Override
    protected void shouldBeVisible() {
        super.shouldBeVisible();
        assertThat(url(), containsString(pageUrl()));
    }
}
