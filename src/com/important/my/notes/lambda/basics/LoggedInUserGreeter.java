package com.important.my.notes.lambda.basics;

public class LoggedInUserGreeter implements Greeter {
    @Override
    public void perform() {
        System.out.println("Welcome back.");
    }
}
