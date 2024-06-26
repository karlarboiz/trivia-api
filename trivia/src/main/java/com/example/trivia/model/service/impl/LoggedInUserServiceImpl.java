package com.example.trivia.model.service.impl;

import com.example.trivia.model.dao.entity.UserInformation;
import com.example.trivia.model.dto.UserInformationInOutDto;
import com.example.trivia.model.logic.UserInformationLogic;
import com.example.trivia.model.service.LoggedInUserService;
import com.example.trivia.obj.UserInformationObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class LoggedInUserServiceImpl implements LoggedInUserService {

    @Autowired
    private UserInformationLogic userInformationLogic;

    @Override
    public UserInformationInOutDto getLoggedInUserDetails() {

        UserInformationInOutDto inOutDto = new UserInformationInOutDto();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserInformationObj userInformationObj = new UserInformationObj();
        String username = authentication.getName();

        UserInformation userInformation = userInformationLogic.matchedLoginCredentialsUsingUsername(username);
        userInformationObj.setId(userInformation.getIdPk());
        userInformationObj.setEmail(userInformation.getEmail());

        inOutDto.setUserInformationObj(userInformationObj);

        return inOutDto;
    }

}
