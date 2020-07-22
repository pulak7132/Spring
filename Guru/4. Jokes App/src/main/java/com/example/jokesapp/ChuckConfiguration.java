package com.example.jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 5/25/17.
 */
@Configuration
//@ComponentScan(basePackages = "guru.springframework.norris.chuck") - this won't work because the class is not annotated with @Component
//https://stackoverflow.com/questions/38790344/springboot-cant-autowire-class-from-other-jar-library/38790797#
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
