package com.pavetok.selement.pages;

import com.pavetok.selement.Child;
import com.pavetok.selement.elements.ResultList;
import org.springframework.beans.factory.annotation.Autowired;

public class ResultPage extends BasePage {

    @Child
    @Autowired
    public ResultList resultList;

    @Override
    protected String url() {
        return "https://www.google.ru";
    }
}
