package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.User;

public interface IGreetingService {
    String getGreetingMessage(User user);
}
