package org.example.practicegitaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class Home {
    @GetMapping
    public String getHome(){
        return "Home";
    }

    @GetMapping("/get")
    public String getPage(){
        return "get page";
    }


}
