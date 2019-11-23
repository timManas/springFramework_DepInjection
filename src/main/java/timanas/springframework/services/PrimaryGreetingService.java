package timanas.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by timmanas on 2019-11-23.
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}