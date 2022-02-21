package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.controllers;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.dtos.MessageDTO;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.Message;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    @GetMapping
    public List<MessageDTO> findMessages(Pageable pageable) {
        return messageService.getAll(pageable).getContent();
    }

    public void message(@RequestBody MessageDTO messageDTO,
                        Authentication authentication) {
        String authName = authentication.getName();
        messageService.message(messageDTO, authName);
    }
}
