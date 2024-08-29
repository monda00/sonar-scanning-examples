package com.acme;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public String getGreetingWithName(String name) {
        return "Hello " + name + ".";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getGreetingWithName("Sam"));
    }
}
