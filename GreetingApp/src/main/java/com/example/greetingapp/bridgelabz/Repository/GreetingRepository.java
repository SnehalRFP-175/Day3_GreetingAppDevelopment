package com.example.greetingapp.bridgelabz.Repository;


import com.example.greetingapp.bridgelabz.Model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository  extends JpaRepository<Greeting, Long> {

}

