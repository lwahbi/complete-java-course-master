package com.important.my.notes.lambda.basics;

import java.util.Scanner;

public class FunctionalProgrammingApp {

    public static void main(String[] args) {
       WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
       Scanner userStatusScanner = new Scanner(System.in);
       String userStatus = userStatusScanner.nextLine();

       Greeter greeter;
       if ("guest".equals(userStatus)) {
           greeter = () -> System.out.println("Welcome to your application. Please create an account or log in.");
       } else if ("loggedIn".equals(userStatus)) {
           greeter = () -> System.out.println("Welcome back.");
       } else {
           greeter = () -> System.err.println("Unknown user status!");
       }

       welcomeMessageService.greet(greeter);





    // mon exemple
       MyFunctionType loggedinUser = () -> System.out.println("welcom");
    }

    interface MyFunctionType {
        void myFunction();
        //void myFunction(int a);
        //int newFunction(int a);
    }

}
