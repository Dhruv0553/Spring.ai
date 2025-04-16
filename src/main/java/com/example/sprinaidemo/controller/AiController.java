package com.example.sprinaidemo.controller;

import com.example.sprinaidemo.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    public String askPrompt(@RequestParam String prompt) {
        return aiService.ask(prompt);
    }
}
