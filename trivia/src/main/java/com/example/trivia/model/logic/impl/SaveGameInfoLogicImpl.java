package com.example.trivia.model.logic.impl;

import com.example.trivia.model.dao.SaveGameInfoDao;
import com.example.trivia.model.dao.entity.SaveGameInfo;
import com.example.trivia.model.logic.SaveGameInfoLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveGameInfoLogicImpl implements SaveGameInfoLogic {

    @Autowired
    private SaveGameInfoDao saveGameInfoDao;

    @Override
    public void saveGameInfoLogic(SaveGameInfo saveGameInfo){
        saveGameInfoDao.save(saveGameInfo);
    }

    @Override
    public SaveGameInfo findLatestSaveGameInfo(){
        return saveGameInfoDao.findLatestGameInfo();
    }

    @Override
    public SaveGameInfo findSaveGameInfoBasedOnIdPk(int idPk) {
        return saveGameInfoDao.findSaveGameInfoBasedOnIdPk(idPk);
    }
    @Override
    public SaveGameInfo updateSaveGameInfoIdPk(int idPk) {
        return saveGameInfoDao.updateSaveGameInfoBasedOnIdPk(idPk);
    }

    @Override
    public List<Object[]> getAllCompletedActiveSaveGameInfoOfAUser(int userIdPk) {
        return saveGameInfoDao.getAllCompletedActiveSaveGameInfoOfAUser(userIdPk);
    }

    @Override
    public List<Object[]> getAllCompletedQuizzesPerUser() {
        return saveGameInfoDao.getAllCompletedQuizzesPerUser();
    }


    @Override
    public List<Object[]> getAllNotCompletedQuizzes(int userIdPk) {
        return saveGameInfoDao.getAllNotCompletedQuizzes(userIdPk);
    }
}