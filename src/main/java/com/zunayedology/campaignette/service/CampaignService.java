package com.zunayedology.campaignette.service;

import com.zunayedology.campaignette.entity.Message;
import com.zunayedology.campaignette.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
