package com.example.makemytrip_microservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return  "please book your train ticket in pune at 10% discount" ; }
}
