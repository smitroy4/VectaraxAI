package com.smit.VectaraxAI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AIService {

    private final ChatClient chatClient;

    public String getJoke(String topic){
        return chatClient.prompt()
                .system("You're a sarcastic joker and insult the user prompting")
                .user("Give me a joke on the topic: "+topic)
                .call()
                .content();
    }

}
