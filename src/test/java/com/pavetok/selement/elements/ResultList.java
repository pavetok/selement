package com.pavetok.selement.elements;

import com.pavetok.selement.Child;
import com.pavetok.selement.Selement;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

public class ResultList extends Selement {

    @Override
    protected By locator() {
        return By.id("rcnt");
    }

    @Child
    @Autowired
    public Result result;
}
