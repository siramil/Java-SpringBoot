package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Post;





@RestController
public class PostController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/post/{id}")
    String post(@PathVariable int id) {
        Post[] posts = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts?id="+id , Post[].class);
        return posts[0].getBody();
    }
    
}
