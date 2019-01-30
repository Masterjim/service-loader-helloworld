package be.jeremy.service.impl;

import be.jeremy.service.GreetingService;

public class GreetingServiceSecondProvider implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println(String.format("Hello %s from second service!", name));
    }

}
