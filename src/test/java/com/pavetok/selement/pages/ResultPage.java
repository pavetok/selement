package com.pavetok.selement.pages;

import com.pavetok.selement.Child;
import com.pavetok.selement.elements.Result;
import com.pavetok.selement.elements.ResultList;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResultPage extends BasePage {

    @Child
    @Autowired
    public ResultList resultList;

    private List<Result> results;

    @Override
    protected void presented() {
        super.presented();
    }

    @Override
    protected String url() {
        return "https://www.google.ru";
    }
}
