package guru.springproject.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingsConfig {

    GreetingsFactory greetingsFactory;

    GreetingsConfig(GreetingsFactory greetingsFactory){
        this.greetingsFactory = greetingsFactory;
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingServiceInterface primaryGreetingsServiceInterface() {
        return greetingsFactory.getGreetings("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingServiceInterface germanGreetingsServiceImpl() {
        return greetingsFactory.getGreetings("de");
    }
    @Bean
    @Primary
    @Profile("es")
    GreetingServiceInterface spanishGreetingsServiceImpl() {
        return greetingsFactory.getGreetings("es");
    }
}
