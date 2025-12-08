package com.soumya.quiz.service;

import com.soumya.quiz.dao.QuestionDao;
import com.soumya.quiz.model.AnswerResponse;
import com.soumya.quiz.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {

    @Autowired
    private QuestionDao questionRepo;

    public Optional<Question> maptoBaseEntity(AnswerResponse ar) {
        if (ar == null || ar.getId() == null) {
            return Optional.empty();
        }
        return questionRepo.findById(ar.getId());
    }
}