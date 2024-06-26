package com.example.trivia.obj;

import lombok.Data;

@Data
public class SaveGameInfoObj {

    private int idPk;

    private String quizUUID;

    private int userIdPk;

    private Long totalCorrect;

    private Long totalIncorrect;

    private Long totalQuizItems;

    private String userName;

    private Long completedQuizzes;

    private Long incompleteQuizzes;

    private String date;
}
