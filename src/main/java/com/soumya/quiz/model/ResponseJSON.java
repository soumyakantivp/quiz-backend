package com.soumya.quiz.model;

import java.util.Optional;

public interface ResponseJSON<Response,BaseEntity> {
    public Optional<Response> maptoResponse(BaseEntity base);
}
