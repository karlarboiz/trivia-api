package com.example.trivia.model.service.impl;

import com.example.trivia.model.dao.entity.ItemDataQuiz;
import com.example.trivia.model.dao.entity.RecordScore;
import com.example.trivia.model.dto.ItemDataQuizInOutDto;
import com.example.trivia.model.dto.RecordQuizInOutDto;
import com.example.trivia.model.logic.ItemDataQuizLogic;
import com.example.trivia.model.logic.RecordScoreLogic;
import com.example.trivia.model.service.RecordScoreService;
import com.example.trivia.obj.RecordQuizObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecordScoreServiceImpl implements RecordScoreService {

    @Autowired
    private RecordScoreLogic recordScoreLogic;

    @Autowired
    private ItemDataQuizLogic itemDataQuizLogic;

    @Override
    public void saveRecordedScore(ItemDataQuizInOutDto itemDataQuizInOutDto) {
        String quizIdTag = itemDataQuizInOutDto.getQuizIdTag();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        int userIdPk = itemDataQuizInOutDto.getQuizUserIdPk();

        int itemIdPk = itemDataQuizInOutDto.getSaveQuizInfoIdPk();
        ItemDataQuiz itemDataQuiz = itemDataQuizLogic.getItemBasedOnQuizIdTagAndQuizUserIdPkAndQuizItemIdPk(quizIdTag,userIdPk,itemIdPk);
        boolean isCorrect = itemDataQuiz.getCorrectAnswer().equals(itemDataQuizInOutDto.getUserAnswer());
        RecordScore recordScore = new RecordScore();

        recordScore.setRecordIdTag(quizIdTag);

        recordScore.setRecordQuizIdPk(itemIdPk);
        recordScore.setRecordUserIdPk(userIdPk);
        recordScore.setCorrect(isCorrect);

        recordScore.setUserAnswer(itemDataQuizInOutDto.getUserAnswer());
        recordScore.setRegId(userIdPk);

        recordScore.setRegDate(timestamp);

        recordScore.setDeleteFlg(false);

        recordScoreLogic.saveRecordScoreLogic(recordScore);

    }

    @Override
    public RecordQuizInOutDto getRecordQuizList(ItemDataQuizInOutDto itemDataQuizInOutDto){
        RecordQuizInOutDto recordQuizInOutDto = new RecordQuizInOutDto();

        List<RecordScore> recordScoreList = recordScoreLogic.getRecordQuizLIst(itemDataQuizInOutDto.getSaveQuizInfoIdPk(),
                itemDataQuizInOutDto.getQuizUserIdPk());

        List<RecordQuizObj> recordQuizObjs = new ArrayList<>();

        for(RecordScore item: recordScoreList){

            RecordQuizObj recordQuizObj = new RecordQuizObj();

            recordQuizObj.setQuizTag(item.getRecordIdTag());

            recordQuizObj.setCorrect(item.isCorrect());

            recordQuizObj.setUserAnswer(item.getUserAnswer());

            recordQuizObjs.add(recordQuizObj);
        }

        recordQuizInOutDto.setRecordQuizObjList(recordQuizObjs);
        return recordQuizInOutDto;
    }

}
