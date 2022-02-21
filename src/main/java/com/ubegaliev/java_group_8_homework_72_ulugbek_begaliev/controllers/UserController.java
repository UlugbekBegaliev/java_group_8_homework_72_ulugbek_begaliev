package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.controllers;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.UserRegisterForm;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String register(@Valid @RequestBody UserRegisterForm userRequestDto,
                           BindingResult validationResult,
                           RedirectAttributes attributes){
        attributes.addFlashAttribute("dto", userRequestDto);

        if (validationResult.hasFieldErrors()){
            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
            return "redirect:/register";
        }
        userService.register(userRequestDto);
        return "redirect:/login";
    }
}
