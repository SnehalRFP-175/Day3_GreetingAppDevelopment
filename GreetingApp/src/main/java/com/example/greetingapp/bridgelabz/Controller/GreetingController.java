package com.example.greetingapp.bridgelabz.Controller;

import com.example.greetingapp.bridgelabz.Model.Greeting;
import com.example.greetingapp.bridgelabz.Service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping
public class GreetingController {

    @Autowired
    private static final String template = "Hello, %s";
     IGreetingService greetingService;

    private final AtomicLong counter= new AtomicLong();

    public GreetingController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

    @GetMapping("/greeting")
    public String greeting(){
        return greetingService.getGreetingMessage();
    }


}