package com.soumya.quiz.service;

import com.soumya.quiz.dao.QuestionDao;
import com.soumya.quiz.model.AnswerResponse;
import com.soumya.quiz.model.Question;
import com.soumya.quiz.model.QuestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuizService {
    @Autowired
    QuestionDao questionDao;

    @Autowired
    AnswerService answerService;

    public List<QuestionResponse> responseMapper(List<Question> questionList){
        if (questionList!=null && !questionList.isEmpty()) {
            return questionList.stream().map(q -> new QuestionResponse().maptoResponse(q).get()).collect(Collectors.toList());
        }
        return new ArrayList<QuestionResponse>();
    }
    public List<QuestionResponse> getAllQuestions(){
        return responseMapper(questionDao.findAll());
    }

    public List<QuestionResponse> getAllQuestionsByCategory(String category) {
        return responseMapper(questionDao.findByCategory(category));
    }

    public boolean evaluate(AnswerResponse answerResponse) {
        return Optional.ofNullable(answerResponse)
                .flatMap(a -> answerService.maptoBaseEntity(a))        // Optional<Question>
                .map(q -> q.getRightAnswer().equals(answerResponse.getAnswer()))
                .orElse(false);
    }
}
