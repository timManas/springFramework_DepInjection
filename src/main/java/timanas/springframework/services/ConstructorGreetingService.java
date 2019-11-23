package timanas.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by timmanas on 2019-11-23.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
