package edu.gradle;

public class HelloGreeting implements GreetingsService {

    public static final String HELLO_MSG = "Hello From " + HelloGreeting.class.getSimpleName();

    @Override
    public String getMessage() {
        return HELLO_MSG;
    }
}