package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.repositories;

import com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}
