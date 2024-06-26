package com.example.trivia.obj;

import lombok.Data;

@Data
public class QuizItemInSessionObj {
    private String quizTag;

    private boolean answered;
}
