package com.example.trivia.model.logic.impl;

import com.example.trivia.model.dao.UserInformationAccountDao;
import com.example.trivia.model.dao.entity.UserInformationAccount;
import com.example.trivia.model.logic.UserInformationAccountLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserInformationAccountLogicImpl implements UserInformationAccountLogic {

    @Autowired
    private UserInformationAccountDao userInformationAccountDao;

    @Override
    public void saveUserInformationAccount(UserInformationAccount userInformationAccount) {
        userInformationAccountDao.save(userInformationAccount);
    }

    @Override
    public UserInformationAccount getUserInfoByUserIdPk(int userIdPk) throws SQLException {
        return userInformationAccountDao.getUserByUserIdPk(userIdPk);
    }
}
