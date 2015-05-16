package com.pavetok.selement.elements;

import com.codeborne.selenide.SelenideElement;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MailForm extends Selement {

    @Override
    protected String locator() {
        return "//div[@class='b-topbar__domik']";
    }

    @Override
    protected void presented() {
        self().shouldBe(visible);
        name().shouldBe(visible);
        password().shouldBe(visible);
        submit().shouldBe(visible);
    }

    public void login(String name, String passwd) {
        name().setValue(name);
        password().setValue(passwd);
        submit().click();
    }

    private SelenideElement name() {
        return $(By.name("login"));
    }

    private SelenideElement password() {
        return $(By.name("passwd"));
    }

    private SelenideElement submit() {
        return $(By.className("auth__login-button"));
    }

}
