package com.soumya.quiz.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.quiz.service.OllamaService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/quiz/ai")
public class OllamaController {

    private final OllamaService service;

    public OllamaController(OllamaService service) {
        this.service = service;
    }

    // Streaming endpoint
    @PostMapping(value = "/ask/stream",
            produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> askStream(@RequestBody String prompt) {

        return service.streamGenerate(prompt)
                .doOnNext(chunk -> System.out.println("AI stream: " + chunk))
                .doOnError(err -> System.err.println("Stream error: " + err.getMessage()))
                .doOnComplete(() -> System.out.println("Stream completed"));
    }
}

