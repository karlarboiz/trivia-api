package com.example.trivia.model.logic;

import com.example.trivia.model.dao.entity.SaveGameInfo;

import java.util.List;

public interface SaveGameInfoLogic {

    public void saveGameInfoLogic(SaveGameInfo saveGameInfo);

    public SaveGameInfo findLatestSaveGameInfo();

    public SaveGameInfo findSaveGameInfoBasedOnIdPk(int idPk);

    public SaveGameInfo updateSaveGameInfoIdPk(int idPk);

    public List<Object[]> getAllCompletedActiveSaveGameInfoOfAUser(int userIdPk);

    public List<Object[]> getAllCompletedQuizzesPerUser();

    public List<Object[]> getAllNotCompletedQuizzes(int userIdPk);


}