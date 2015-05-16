package com.pavetok.selement.domain;

public class Result {
    private String linkText;
    private String description;

    public Result(String linkText, String description) {
        this.linkText = linkText;
        this.description = description;
    }

    public String linkText() {
        return linkText;
    }

    public String description() {
        return description;
    }
}
