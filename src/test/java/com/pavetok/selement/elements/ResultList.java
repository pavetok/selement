package com.pavetok.selement.elements;

import com.pavetok.selement.Selement;
import org.openqa.selenium.By;

public class ResultList extends Selement {
    @Override
    protected By locator() {
        return By.id("rcnt");
    }
}
