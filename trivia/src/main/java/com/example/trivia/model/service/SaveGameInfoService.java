package com.example.trivia.model.service;

import com.example.trivia.model.dto.SaveGameInfoInOutDto;

public interface SaveGameInfoService {
    public SaveGameInfoInOutDto saveGameInformation(SaveGameInfoInOutDto inDto);

    public SaveGameInfoInOutDto findLatestSaveGameInfo();


    public SaveGameInfoInOutDto findSaveGameInfoBasedOnIdPk(SaveGameInfoInOutDto inDto);

    public void updateSaveGameInfo(SaveGameInfoInOutDto inOutDto);

    public SaveGameInfoInOutDto getAllDetailsOfSavedGames(SaveGameInfoInOutDto inDto);

    public SaveGameInfoInOutDto getAllNotCompletedQuizzes(SaveGameInfoInOutDto inOutDto);
}

