package com.contextflow.ai.controller;

import com.contextflow.ai.model.ContextRequest;
import com.contextflow.ai.model.ContextResponse;
import com.contextflow.ai.service.ContextAiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/context")
@CrossOrigin(origins = "http://localhost:5173")
public class ContextController {

    private final ContextAiService contextAiService;

    public ContextController(ContextAiService contextAiService) {
        this.contextAiService = contextAiService;
    }

    @PostMapping("/analyze")
    public ContextResponse analyze(@RequestBody ContextRequest request) {

        String result = contextAiService.analyze(
                request.getContent(),
                request.getGoal()
        );

        return new ContextResponse(result);
    }
}