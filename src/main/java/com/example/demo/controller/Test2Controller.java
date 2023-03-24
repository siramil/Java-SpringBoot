package com.example.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Test2Controller {


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) { 
    return "Hello " + name ;
}

}
