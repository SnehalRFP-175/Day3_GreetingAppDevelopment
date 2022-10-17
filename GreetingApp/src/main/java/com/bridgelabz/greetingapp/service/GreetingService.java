package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{

    public String getGreetingMessage(User user){
        return "Hello World!";
    }
}
