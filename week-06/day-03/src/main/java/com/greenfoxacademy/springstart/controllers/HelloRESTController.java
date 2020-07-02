package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
//    AtomicLong counter = new AtomicLong();
    long counter = 0;

    @RequestMapping(value = "/greeting")
//    public Greeting greeting(@RequestParam String name){
//        return new Greeting(counter.getAndIncrement(), "Hello " + name);
    public Greeting restController(){
        Greeting greeting = new Greeting(counter, "Hello World");
        counter++;
        return greeting;
    }
}
