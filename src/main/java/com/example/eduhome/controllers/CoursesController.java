package com.example.eduhome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CoursesController {
    @GetMapping("/courses")
    public String index(Model model){
        model.addAttribute("isContactPage", false);
        return "courses";
    }

    @GetMapping("/courses/detail")
    public String detail(Model model){
        model.addAttribute("isContactPage", false);
        return "courseDetail";
    }
}
