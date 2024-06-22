package com.zunayedology.campaignette.service;

import com.zunayedology.campaignette.entity.Message;
import com.zunayedology.campaignette.entity.PhoneNumber;
import com.zunayedology.campaignette.repository.MessageRepository;
import com.zunayedology.campaignette.repository.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    public String sendMessage(Message message) {
        Message savedMessage = messageRepository.save(message);
        StringBuilder result = new StringBuilder();

        for (PhoneNumber phoneNumber : savedMessage.getReceivers()) {
            result.append(String.format("Message %d sent to %s\n", savedMessage.getId(), phoneNumber.getNumber()));
        }

        return result.toString();
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }
}
