package com.pavetok.selement;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

abstract public class Selement {
    public SelenideElement self() {
        return $(locator());
    }

    public SelenideElement self(int index) {
        return $(locator(), index - 1);
    }

    public void shouldBeVisibleWithChildren() throws InvocationTargetException, IllegalAccessException {
        this.shouldBeVisible();
        for (Selement child : children()) {
            child.shouldBeVisibleWithChildren();
        }
    }

    protected abstract By locator();

    protected void shouldBeVisible() {
        self().shouldBe(visible);
    }

    private List<Selement> children() throws InvocationTargetException, IllegalAccessException {
        List<Selement> selements = new ArrayList<Selement>();

        Class elementClass = this.getClass();
        for (Field field : elementClass.getDeclaredFields()) {
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                if (annotation instanceof Child) {
                    selements.add((Selement) field.get(this));
                }
            }
        }

        return selements;
    }

    public void click() {
        self().click();
    }
}
