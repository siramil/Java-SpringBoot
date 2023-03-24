package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test1;
@RestController
public class Test1Controller {

    public AtomicLong counter = new AtomicLong();
    

    @PostMapping("/submit")
    public String submit (@RequestBody Test1 test1) {
    return test1.getContent();
}
}
