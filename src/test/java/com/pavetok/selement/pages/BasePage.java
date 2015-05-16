package com.pavetok.selement.pages;

import com.pavetok.selement.Selement;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

abstract public class BasePage extends Selement {

    protected abstract String url();

    @Override
    protected String locator() {
        return "//body";
    }

    @Override
    protected void presented() {
        assertThat(url(), containsString(this.url()));
    }
}
