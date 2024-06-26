package com.example.trivia.model.dto;

import com.example.trivia.obj.SaveGameInfoObj;
import com.example.trivia.obj.UserInformationObj;
import lombok.Data;

import java.util.List;

@Data
public class SaveGameInfoInOutDto {
    private UserInformationObj userInformationObj;

    private String quizUUID;

    private boolean updateSaveGameInfo;

    private int idPk;

    private int userIdPk;

    private List<SaveGameInfoObj> savedGameDetails;

    private String date;
}

