package com.example.firstspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleController")
public class SampleController {

    //UTL http://localhost:portNo/URI
    // http://localhost:8080/sampleController/sampleGetMethod
    @GetMapping("/sampleGetMethod")
    public String sampleGetMethod() {
        return "Hello World";
    }
}
