package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
    @Bean
    public Animal animal() {
        return new Animal();
    }

    @Bean
    public Dog dog() {
        return new Dog(3);
    }

    @Bean
    public PetCat myCat(){
        return new PetCat(1);
    }
}
