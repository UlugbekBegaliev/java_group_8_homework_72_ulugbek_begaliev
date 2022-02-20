package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.controllers;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;
}
