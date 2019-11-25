package timanas.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by timmanas on 2019-11-23.
 */
//@Service
//@Primary
//@Profile({"en", "default"})
//public class PrimaryGreetingService implements GreetingService {
//
//    @Override
//    public String sayGreeting() {
//        return "Hello - Primary Greeting service";
//    }
//}

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}