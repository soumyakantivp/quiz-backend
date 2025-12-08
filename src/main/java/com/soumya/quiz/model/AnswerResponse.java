package com.soumya.quiz.model;

import com.soumya.quiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
public class AnswerResponse implements ResponseJSON<AnswerResponse,Question> {
    private Integer id;
    private String answer;
    @Autowired
    QuestionDao questionRepo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public Optional<AnswerResponse> maptoResponse(Question question) {
        if(question == null) return Optional.empty();
        AnswerResponse ar = new AnswerResponse();
        ar.setId(question.getId());
        return Optional.of(ar);
    }
}
