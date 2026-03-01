package com.example.SimpleConfessions.Service;


import com.example.SimpleConfessions.Entity.Confessions;
import com.example.SimpleConfessions.Repository.ConfessionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfessionsService {
    private final ConfessionsRepository repository;

    public ConfessionsService(ConfessionsRepository repository){
        this.repository = repository;
    }

    // getting all the messages
    public List<Confessions> getMessages(){
        return repository.findAll();
    }


    // creating the message
    public Confessions createConfession(String message){
        return repository.save( new Confessions(message));
    }
}
