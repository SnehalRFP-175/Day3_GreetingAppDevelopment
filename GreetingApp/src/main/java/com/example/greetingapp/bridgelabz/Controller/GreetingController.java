package com.example.greetingapp.bridgelabz.Controller;

import com.example.greetingapp.bridgelabz.Model.GreetingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingController
{
    @Autowired
    private static final String template = "Hello, %s!";
    private final AtomicLong counter= new AtomicLong();

    @GetMapping("/Greetings")
    public GreetingModel greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new GreetingModel(counter.incrementAndGet(),String.format(template,name));
    }

}
