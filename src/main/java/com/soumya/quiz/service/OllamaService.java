package com.soumya.quiz.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.soumya.quiz.model.OllamaStreamResponse;

import reactor.core.publisher.Flux;

import java.util.Map;

@Service
public class OllamaService {

    private final WebClient webClient;

    @Value("${ollama.model:qwen2-math:1.5b}")
    private String model;

    public OllamaService(WebClient.Builder builder,
                         @Value("${ollama.url:http://localhost:11434}") String baseUrl) {

        this.webClient = builder
                .baseUrl(baseUrl)
                .build();
    }

    public Flux<String> streamGenerate(String prompt) {

        Map<String, Object> request = Map.of(
                "model", model,
                "prompt", prompt,
                "stream", true
        );

        return webClient.post()
                .uri("/api/generate")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .bodyToFlux(OllamaStreamResponse.class)
                .map(OllamaStreamResponse::getResponse)
                .filter(text -> text != null && !text.isEmpty());
    }
}
