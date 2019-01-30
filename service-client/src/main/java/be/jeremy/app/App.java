package be.jeremy.app;

import java.util.List;
import be.jeremy.service.provider.GreetingServiceProvider;
import be.jeremy.service.GreetingService;

public class App {

    public static void main(String... args) {
        List<GreetingService> services = GreetingServiceProvider.INSTANCE.getServiceProviders();

        services.forEach(s -> s.greet("Chuck Norris"));
    }
}
