package com.example.trivia.model.logic.impl;

import com.example.trivia.model.dao.UserInformationDao;
import com.example.trivia.model.dao.entity.UserInformation;
import com.example.trivia.model.logic.UserInformationLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationLogicImpl implements UserInformationLogic {

    @Autowired
    private UserInformationDao userInformationDao;

    @Override
    public void saveUserInformation(UserInformation userInformation) {


        userInformationDao.saveAndFlush(userInformation);
    }

    @Override
    public UserInformation matchedLoginCredentials(String email) {
        return userInformationDao.matchedLoginCredentials(email);
    }

    @Override
    public UserInformation matchedLoginCredentialsUsingUsername(String username)  {
        return userInformationDao.matchedLoginCredentialsUsingUsername(username);
    }
}

