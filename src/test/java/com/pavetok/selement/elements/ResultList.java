package com.pavetok.selement.elements;

import com.pavetok.selement.Selement;
import com.pavetok.selement.domain.Result;
import org.openqa.selenium.By;

public class ResultList extends Selement {
    @Override
    protected By locator() {
        return By.id("rcnt");
    }

    public void shouldContain(Result result) throws Exception {
        ResultUI resultUI = new ResultUI(result);
        resultUI.shouldBePresented();
    }
}
