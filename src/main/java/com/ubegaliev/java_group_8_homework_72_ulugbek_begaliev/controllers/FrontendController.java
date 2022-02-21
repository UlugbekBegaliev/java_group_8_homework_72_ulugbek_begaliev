package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.controllers;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class FrontendController {

    private final UserService userService;

    @GetMapping("/profile")
    public String pageUserProfile(Model model, Principal principal){

        var user = userService.getByEmail(principal.getName());
        model.addAttribute("dto", user);
        return "profile";
    }
}
