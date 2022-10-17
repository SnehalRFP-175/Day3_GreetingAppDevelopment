package com.example.greetingapp.bridgelabz.Service;


import com.example.greetingapp.bridgelabz.Repository.GreetingRepository;
import com.example.greetingapp.bridgelabz.Model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

public abstract class GreetingService implements IGreetingService{
    public String getGreetingMessage(){
        return "Hello World!";
    }
}
