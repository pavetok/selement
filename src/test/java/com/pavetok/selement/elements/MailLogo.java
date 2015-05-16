package com.pavetok.selement.elements;

import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

public class MailLogo extends Selement {

    @Override
    protected By locator() {
        return By.className("b-stamp__mail__text");
    }
}
