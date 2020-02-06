package com.mycompany.app;

/**
 ********DHIVYA*********
 ********%%%%%%%%%%%%%%%**********!
 */
public class App
{

    private final String message = "Hello Dhivya... !";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
