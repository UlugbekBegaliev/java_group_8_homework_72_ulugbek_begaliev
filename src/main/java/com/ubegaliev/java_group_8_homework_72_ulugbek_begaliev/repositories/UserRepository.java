package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
