package com.aiportfolio.chatendpoint.controller;

import com.aiportfolio.chatendpoint.model.EmailRequest;
import com.aiportfolio.chatendpoint.model.EmailResponse;
import com.aiportfolio.chatendpoint.service.EmailClassifierService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailClassifierController {

    private final EmailClassifierService emailClassifierService;

    public EmailClassifierController(EmailClassifierService emailClassifierService) {
        this.emailClassifierService = emailClassifierService;
    }

    @PostMapping("/classify")
    public EmailResponse classifyEmail(@RequestBody EmailRequest request) {
        return emailClassifierService.classify(request.getSubject(), request.getBody());
    }
}
