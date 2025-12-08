package com.soumya.quiz.controller;

import com.soumya.quiz.model.AnswerResponse;
import com.soumya.quiz.model.QuestionResponse;
import com.soumya.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @GetMapping("/all")
    public List<QuestionResponse> getAllQuestions() {
        return quizService.getAllQuestions();
    }

    @GetMapping("/{category}/all")
    public List<QuestionResponse> getAllQuestions(@PathVariable("category") String category) {
        return quizService.getAllQuestionsByCategory(category);
    }

    @PostMapping("/submit")
    public boolean evaluate(@RequestBody AnswerResponse answerResponse) {
        return quizService.evaluate(answerResponse);
    }
}