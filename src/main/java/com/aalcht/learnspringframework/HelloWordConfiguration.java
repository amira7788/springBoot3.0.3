package com.aalcht.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record is created to eliminate the verbosity in creating java Beans
//public acccessor methods, constructor, toString, hashCode, equals are created automatically
//released on JDK 16.
record Person(String name, int age, Address address) {};
record Address(String firsLine, String city) {};
@Configuration
public class HelloWordConfiguration {

    //inject beans here
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 10;
    }

    @Bean
    public  Person person() {
        return new Person("Ravi", 20,  new Address("ligne1", "cergy"));
    }

    @Bean
    public  Person person2MethodCall() {
        return new Person(name(), age(), address()); //name,age
    }

    @Bean
    public  Person person3Parameters(String name, int age, Address address3) {
        //name, age, adress2
        return new Person(name, age, address3); //name,age
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("ligne1", "cergy");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("ligne3", "nanterre");
    }
}
