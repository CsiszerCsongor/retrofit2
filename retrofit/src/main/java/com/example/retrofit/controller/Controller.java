package com.example.retrofit.controller;

import com.example.retrofit.service.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CallService callService;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") Long id){
        return callService.getUser(id);
    }
}
