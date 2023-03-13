package com.aalcht.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWordSpring {

    public static void main(String[] args) {
        //1: Launch a Spring Context -
        //this is the try with ressources if there are an exception context.close will be automatiquely closed
        try (var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class)) {
            //2: Configure the things that we want Spring to manage @Configuration class

            //3 retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean("person5Qualifier"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean(Address.class));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}