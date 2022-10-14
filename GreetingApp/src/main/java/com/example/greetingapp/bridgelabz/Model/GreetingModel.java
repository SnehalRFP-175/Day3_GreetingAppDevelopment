package com.example.greetingapp.bridgelabz.Model;

import javax.persistence.Column;
import javax.persistence.Id;

public class GreetingModel {
    @Id

    @Column(name="id", nullable=false)
    private long id;
    @Column(name="message", nullable=false)
    private String message;

    public GreetingModel(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
