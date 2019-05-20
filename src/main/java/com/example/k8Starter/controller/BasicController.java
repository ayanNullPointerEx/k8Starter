package com.example.k8Starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/check")
    public String getResponse() {
        return "k8 Service deployed successfully";
    }

}
