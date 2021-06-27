package com.example.CICDdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping(value={"/helloworld","/hello"})
    public String showHelloWorld(){
      return "Hello Kishor";
    }
}
