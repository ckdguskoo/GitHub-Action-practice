package org.example.practicegitaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class Home {
    @GetMapping("/get")
    public String home(){
        return "home page";
    }


}
