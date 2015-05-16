package com.pavetok.selement.pages;

import com.pavetok.selement.Child;
import com.pavetok.selement.elements.MailForm;
import org.springframework.beans.factory.annotation.Autowired;

public class MainPage extends BasePage {

    @Autowired
    private MailForm mailForm;

    @Override
    protected String url() {
        return "http://www.yandex.ru";
    }

    @Child
    public MailForm mailForm() {
        return mailForm;
    }
}
