package com.example.trivia.model.logic.impl;

import com.example.trivia.model.dao.RecordScoreDao;
import com.example.trivia.model.dao.entity.RecordScore;
import com.example.trivia.model.logic.RecordScoreLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordScoreLogicImpl implements RecordScoreLogic {
    @Autowired
    private RecordScoreDao recordScoreDao;


    @Override
    public void saveRecordScoreLogic(RecordScore recordScore) {
        recordScoreDao.save(recordScore);
    }

    @Override
    public List<RecordScore> getRecordQuizLIst(int itemIdPk, int userIdPk) {
        return recordScoreDao.getRecordQuizList(itemIdPk,userIdPk);
    }
}

