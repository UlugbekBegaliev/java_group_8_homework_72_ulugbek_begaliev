package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.controllers;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.UserRegisterForm;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class FrontendController {

    private final UserService userService;

    @GetMapping
    public String mainChatPage(){
        return "chat";
    }

    @GetMapping("/profile")
    public String pageUserProfile(Model model, Principal principal){

        var user = userService.getByEmail(principal.getName());
        model.addAttribute("dto", user);
        return "profile";
    }

    @GetMapping("/register")
    public String registerPage(Model model){
        if (!model.containsAttribute("dto")){
            model.addAttribute("dto", new UserRegisterForm());
        }
        return "register";
    }

    public String loginPage(@RequestParam(required = false, defaultValue = "false") Boolean error, Model model){
        model.addAttribute("error", error);
        return "login";
    }
}
