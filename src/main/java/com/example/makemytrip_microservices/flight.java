package com.example.makemytrip_microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return  "please book your flight ticket in pune 10% discount" ; }
}

