package com.aalcht.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
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

    @Bean
    public  Person person4Parameters(String name, int age, Address address) {
        //name, age, adress2
        return new Person(name, age, address); //name,age
    }
    @Bean
    public  Person person5Qualifier(String name, int age, @Qualifier("address3qualifier")Address address) {
        //name, age, adress2
        return new Person(name, age, address); //name,age
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("ligne1", "cergy");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("ligne3", "nanterre");
    }
}
