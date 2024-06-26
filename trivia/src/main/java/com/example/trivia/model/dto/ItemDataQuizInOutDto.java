package com.example.trivia.model.dto;

import com.example.trivia.obj.ItemDataQuizObj;
import com.example.trivia.request.RequestListOfQuizData;
import lombok.Data;

import java.util.List;

@Data
public class ItemDataQuizInOutDto {

    private String quizIdTag;

    private int saveQuizInfoIdPk;

    private int quizUserIdPk;

    private int incrementId;

    private boolean isCorrect;

    private  String userAnswer;
    private String correctAnswer;
    private List<RequestListOfQuizData> requestListOfQuizData;

    private List<ItemDataQuizObj> itemDataQuizObjList;

}