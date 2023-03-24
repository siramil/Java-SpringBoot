package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Todo;

import org.springframework.beans.factory.annotation.Autowired;




@RestController
public class TodoController {
    @Autowired
    RestTemplate restTemplate;

    
    @GetMapping("/todo")
    public Todo todo() {
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todo.class);
        return todo;
        }

}

    
