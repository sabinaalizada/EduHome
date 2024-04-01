package com.example.eduhome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogsController {
    @GetMapping("/blogs")
    public String index(Model model){
        model.addAttribute("isContactPage", false);
        return "blogs";
    }
}
