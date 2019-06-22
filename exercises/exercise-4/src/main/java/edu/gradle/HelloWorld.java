package edu.gradle;

public class HelloWorld {

    public static final String HELLO_MSG = "Hello From Gradle!!!";

    public String sayHello() {
        return HELLO_MSG;
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }
}