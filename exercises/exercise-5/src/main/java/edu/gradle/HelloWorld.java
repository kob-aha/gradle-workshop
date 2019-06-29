package edu.gradle;

public class HelloWorld {

    public static final String HELLO_MSG = "Hello From Gradle!!!";

    // Define an unread variable so that SpotBugs will create an issue
    private int unreadField;

    public String sayHello() {
        return HELLO_MSG;
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }
}