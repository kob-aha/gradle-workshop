package edu.gradle;

public class GreetingClient {

    private final GreetingsService service;

    public GreetingClient(GreetingsService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        GreetingClient greetingClient = new GreetingClient(new HelloGreeting());

        System.out.println(greetingClient.service.getMessage());
    }
}
