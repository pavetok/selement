package com.pavetok.selement.pages;

import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

abstract public class BasePage extends Selement {

    protected abstract String url();

    @Override
    protected By locator() {
        return By.tagName("body");
    }

    @Override
    protected void visible() {
        assertThat(url(), containsString(this.url()));
    }
}
