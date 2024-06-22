package com.zunayedology.campaignette.controller;

import com.zunayedology.campaignette.entity.Message;
import com.zunayedology.campaignette.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return campaignService.sendMessage(message);
    }

    @GetMapping
    public List<Message> getAllMessages() {
        return campaignService.getAllMessages();
    }
}
