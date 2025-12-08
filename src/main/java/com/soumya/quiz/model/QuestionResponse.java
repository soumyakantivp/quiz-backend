package com.soumya.quiz.model;


import com.soumya.quiz.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
public class QuestionResponse implements ResponseJSON<QuestionResponse,Question> {
    private Integer Id;
    private String questionTilte;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Autowired
    QuestionDao questionRepo;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getQuestionTilte() {
        return questionTilte;
    }

    public void setQuestionTilte(String questionTilte) {
        this.questionTilte = questionTilte;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    @Override
    public Optional<QuestionResponse> maptoResponse(Question question) {
        if(question == null) return Optional.empty();
        QuestionResponse qr = new QuestionResponse();
        qr.setId(question.getId());
        qr.setQuestionTilte(question.getQuestionTilte());
        qr.setOption1(question.getOption1());
        qr.setOption2(question.getOption2());
        qr.setOption3(question.getOption3());
        qr.setOption4(question.getOption4());
        return Optional.of(qr);
    }
}
