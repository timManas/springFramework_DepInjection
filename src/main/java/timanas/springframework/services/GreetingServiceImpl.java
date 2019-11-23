package timanas.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by timmanas on 2019-11-23.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
