package guru.springframework.config;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }
    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }
//    @Bean
//    @Primary
//    @Profile("es")
//    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
//        return greetingServiceFactory.createGreetingService("es");
//    }
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingRepository greetingRepository){
        return greetingServiceFactory(greetingRepository).createGreetingService("es");
    }
}
