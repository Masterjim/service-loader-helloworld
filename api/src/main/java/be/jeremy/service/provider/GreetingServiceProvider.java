package be.jeremy.service.provider;

import be.jeremy.service.GreetingService;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public enum GreetingServiceProvider {

    INSTANCE;

    private ServiceLoader<GreetingService> loader;

    GreetingServiceProvider() {
        loader = ServiceLoader.load(GreetingService.class);
    }

    public List<GreetingService> getServiceProviders() {
        List<GreetingService> result = new ArrayList<>();

        for (GreetingService svc: loader) {
            result.add(svc);
        }

        return result;
    }

}
