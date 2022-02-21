package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.dtos.MessageDTO;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.Message;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.User;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories.MessageRepository;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;

    public Page<MessageDTO> getAll(Pageable pageable) {
        Page<Message> messages = messageRepository.findAll(pageable);
        return messages.map(MessageDTO::from);
    }

    public void message(MessageDTO messageDTO, String email) {

        User user = userRepository.findByEmail(email).get();

        Message message = Message.builder()
                .text(messageDTO.getText())
                .dateTime(LocalDateTime.now())
                .sender(user)
                .build();

        messageRepository.save(message);
    }
}
