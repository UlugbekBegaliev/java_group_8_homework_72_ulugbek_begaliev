package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories.MessageRepository;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
}
