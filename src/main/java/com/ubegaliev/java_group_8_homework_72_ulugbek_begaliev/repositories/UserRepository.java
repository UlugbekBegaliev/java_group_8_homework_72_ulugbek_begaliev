package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> finByEmail(String email);

    boolean existsByEmail(String email);
}
