package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.services;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.dtos.UserDTO;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.exceptions.UserAlreadyRegisteredException;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.User;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.UserRegisterForm;
import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    public void register(UserRegisterForm userRegisterForm) {

        if (userRepository.existsByEmail(userRegisterForm.getEmail())) {
            throw new UserAlreadyRegisteredException();
        }

        var user = User.builder()
                .email(userRegisterForm.getEmail())
                .username(userRegisterForm.getName())
                .password(encoder.encode(userRegisterForm.getPassword()))
                .build();

        userRepository.save(user);
    }

    public UserDTO getByEmail(String email) {

        var user = userRepository.findByEmail(email).get();

        return UserDTO.from(user);
    }
}
