package com.aiportfolio.chatendpoint.controller;

import com.aiportfolio.chatendpoint.model.ChatRequest;
import com.aiportfolio.chatendpoint.model.ChatResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {

    @PostMapping("/chat")
    public ResponseEntity<?> chat(@RequestBody ChatRequest request) {
        String reply = "AI Response: " + request.getMessage();
        return ResponseEntity.ok(new ChatResponse(reply));
    }
}

