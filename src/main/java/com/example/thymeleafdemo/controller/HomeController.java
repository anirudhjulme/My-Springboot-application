package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        Message message = new Message("Hello from Spring Boot and Thymeleaf!");
        model.addAttribute("message", message);
        return "home";
    }
}
