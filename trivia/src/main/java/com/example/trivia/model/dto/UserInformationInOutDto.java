package com.example.trivia.model.dto;

import com.example.trivia.obj.UserInformationObj;
import lombok.Data;

import java.util.List;

@Data
public class UserInformationInOutDto {

    private List<UserInformationObj> studentObjList;

    private UserInformationObj userInformationObj;

    private String username;

    private String quizUUID;

    private boolean updateSaveGameInfo;


}