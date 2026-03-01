package com.example.SimpleConfessions.Controller;


import com.example.SimpleConfessions.Entity.Confessions;
import com.example.SimpleConfessions.Service.ConfessionsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/confession")
public class ConfessionsController {
    private final ConfessionsService service;

    public ConfessionsController(ConfessionsService service){
        this.service = service;
    }

    @GetMapping("/")
    public List<Confessions> getConfessions(){
        return service.getMessages();
    }

    @PostMapping("/")
    public Confessions createConfession(@RequestParam("message") String message){
        return service.createConfession(message);
    }
}
