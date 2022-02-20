package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.dtos;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.Message;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class MessageDTO {

    private int id;
    private String text;
    private LocalDateTime dateTime;
    private UserDTO sender;

    public static MessageDTO from(Message message){
        return MessageDTO.builder()
                .id(message.getId())
                .text(message.getText())
                .dateTime(message.getDateTime())
                .sender(UserDTO.from(message.getSender()))
                .build();
    }
}
