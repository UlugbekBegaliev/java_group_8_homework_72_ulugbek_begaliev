package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.dtos;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.User;
import lombok.*;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class UserDTO {

    private int id;
    private String email;
    private String username;

    public static UserDTO from(User user){
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .username(user.getUsername())
                .build();
    }
}
