package com.m.holmes2076.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "главная страница");
        return "home";
    }

    @GetMapping("/about")
    public String blogMain(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
    }
}