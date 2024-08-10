package com.haseeb.chatapp.repository;

import com.haseeb.chatapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
