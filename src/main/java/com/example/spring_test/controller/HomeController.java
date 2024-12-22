package com.example.spring_test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/regist/index")
    public String registIndex() {
        return "regist_index";
    }

    @GetMapping("/regist")
    public String regist() {
        return "regist";
    }

    @GetMapping("/auth/login")
    public String login() {
        return "login";
    }

    @GetMapping("/auth/signup")
    public String signup(){
        return "signup";
    }
}
