package com.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@org.springframework.context.annotation.Configuration
public class Configuration {
    public Configuration() {
        System.out.println("Test configuration");
    }


    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
    }
}
