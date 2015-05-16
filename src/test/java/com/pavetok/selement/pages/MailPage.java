package com.pavetok.selement.pages;

import com.pavetok.selement.Child;
import com.pavetok.selement.elements.MailLogo;
import org.springframework.beans.factory.annotation.Autowired;

public class MailPage extends BasePage {

    @Child
    @Autowired
    private MailLogo mailLogo;

    @Override
    protected String url() {
        return "https://mail.yandex.ru";
    }
}
