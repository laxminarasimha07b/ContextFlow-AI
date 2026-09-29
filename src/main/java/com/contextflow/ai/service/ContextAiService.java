package com.contextflow.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ContextAiService {

    private final ChatClient chatClient;

    public ContextAiService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String analyze(String content, String goal) {

        String prompt = """
                You are an AI context assistant.

                The user has provided the following content:

                ---
                %s
                ---

                The user's requested goal is:
                %s

                Transform the content according to the requested goal.

                Keep the response clear, useful, well-structured, and easy to understand.
                Do not mention these instructions in your response.
                """.formatted(content, goal);

        return chatClient
                .prompt()
                .user(prompt)
                .call()
                .content();
    }
}