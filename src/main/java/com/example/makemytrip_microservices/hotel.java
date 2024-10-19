package com.example.makemytrip_microservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() {return  "please book your hotel ticket in pune at 10% discount" ; }
}

