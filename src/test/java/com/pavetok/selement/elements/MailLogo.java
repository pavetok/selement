package com.pavetok.selement.elements;

import com.pavetok.selement.Selement;

public class MailLogo extends Selement {

    @Override
    protected String locator() {
        return "//span[@class='b-stamp__mail__text']";
    }
}
