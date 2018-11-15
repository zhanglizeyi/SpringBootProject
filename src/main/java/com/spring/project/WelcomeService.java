package com.spring.project;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

    public String retrieveWelcomeMessage() {
        return "Welcome to the Spring Project";
    }
}


