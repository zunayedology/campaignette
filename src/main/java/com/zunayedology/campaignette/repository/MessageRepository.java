package com.zunayedology.campaignette.repository;

import com.zunayedology.campaignette.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
