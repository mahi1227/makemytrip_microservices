package com.example.makemytrip_microservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    @GetMapping("/visa")
    public String getData() {return  "please take your visa ticket in pune at 10% discount" ; }
}
