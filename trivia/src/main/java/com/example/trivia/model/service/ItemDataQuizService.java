package com.example.trivia.model.service;

import com.example.trivia.model.dto.ItemDataQuizInOutDto;

import java.util.List;

public interface ItemDataQuizService {

    public void saveItemDataQuiz(ItemDataQuizInOutDto inOutDto) ;
    public void saveListOfItemDataQuiz(List<ItemDataQuizInOutDto> itemDataQuizInOutDtoList);

    public ItemDataQuizInOutDto getListOfQuizItems(ItemDataQuizInOutDto itemDataQuizInOutDto);

    public ItemDataQuizInOutDto getListOfAnsweredQuizItems(ItemDataQuizInOutDto itemDataQuizInOutDto);
    public ItemDataQuizInOutDto getListOfAnswerQuizItemsBasedOnUserIdPkAndItemIdPk(ItemDataQuizInOutDto itemDataQuizInOutDto);
}
