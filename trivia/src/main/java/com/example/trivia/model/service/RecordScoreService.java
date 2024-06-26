package com.example.trivia.model.service;

import com.example.trivia.model.dto.ItemDataQuizInOutDto;
import com.example.trivia.model.dto.RecordQuizInOutDto;

public interface RecordScoreService {

    public void saveRecordedScore(ItemDataQuizInOutDto itemDataQuizInOutDto);
    public RecordQuizInOutDto getRecordQuizList(ItemDataQuizInOutDto itemDataQuizInOutDto);

}
