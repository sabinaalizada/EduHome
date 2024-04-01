package com.example.eduhome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account/login")
    public String login(Model model){
        model.addAttribute("isContactPage", false);
        return "login";
    }

    @GetMapping("/account/signup")
    public String signup(Model model){
        model.addAttribute("isContactPage", false);
        return "signup";
    }
}
