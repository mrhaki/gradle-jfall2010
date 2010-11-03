package com.mrhaki;

import static org.apache.commons.lang.StringUtils.swapCase;

public class Person {
    private String username;

    public Person(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getSwappedUsername() {
        return swapCase(username);
    }
}