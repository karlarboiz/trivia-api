package com.example.trivia.model.logic;

import com.example.trivia.model.dao.entity.ItemDataQuiz;

import java.util.List;

public interface ItemDataQuizLogic {

    public void saveItemDataQuiz(ItemDataQuiz itemDataQuiz);

    public void saveListItemDataQuiz(List<ItemDataQuiz> itemDataQuizList);
    public List<ItemDataQuiz> getListOfItemsBasesOnGameInfoIdAndUserId(int itemIdPk, int userIdPk);

    public ItemDataQuiz getItemBasedOnQuizIdTagAndQuizUserIdPkAndQuizItemIdPk(String quizIdTag,
                                                                              int quizUserIdPk,int quizItemIdPk);

    public List<Object[]> getAnsweredQuizInfoListBasedOnUserIdPkAndItemIdPk(int userIdPk, int itemIdPk);
}

