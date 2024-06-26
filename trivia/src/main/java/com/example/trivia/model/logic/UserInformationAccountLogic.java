package com.example.trivia.model.logic;

import com.example.trivia.model.dao.entity.UserInformationAccount;

import java.sql.SQLException;

public interface UserInformationAccountLogic {
    public void saveUserInformationAccount(UserInformationAccount userInformationAccount);

    public UserInformationAccount getUserInfoByUserIdPk(int userIdPk) throws SQLException;
}

