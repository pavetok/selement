package com.pavetok.selement;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

abstract public class Selement {

    protected abstract String locator();

    protected void presented() {
        self().shouldBe(visible);
    }

    // TODO: handle locators of any types
    public SelenideElement self() {
        return $(By.xpath(this.locator()));
    }

    public void shouldBePresented() throws InvocationTargetException, IllegalAccessException {
        this.presented();

        for (Selement child : children()) {
            child.shouldBePresented();
        }
    }

    private List<Selement> children() throws InvocationTargetException, IllegalAccessException {
        List<Selement> selements = new ArrayList<Selement>();

        Class elementClass = this.getClass();
        for (Method method : elementClass.getMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                if (annotation instanceof Child) {
                    selements.add((Selement)method.invoke(this));
                }
            }
        }

        return selements;
    }
}
