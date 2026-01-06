package org.example.practicegitaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note")
public class Notes {

    @GetMapping("/get")
    public String getNote(){
        return "배포테스트 글입니다.";
    }

}
