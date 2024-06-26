package com.example.trivia.model.logic;

import com.example.trivia.model.dao.entity.UserInformation;

public interface UserInformationLogic {
    public void saveUserInformation(UserInformation userInformation);

    public UserInformation matchedLoginCredentials(String email) ;

    public UserInformation matchedLoginCredentialsUsingUsername(String username) ;
}
