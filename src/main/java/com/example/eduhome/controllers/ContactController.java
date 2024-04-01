package com.example.eduhome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ContactController {
    @GetMapping("/contact")
    public String index(Model model){
        model.addAttribute("isContactPage", true);

        return "contact";
    }

}
