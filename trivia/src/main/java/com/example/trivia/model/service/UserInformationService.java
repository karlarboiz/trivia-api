package com.example.trivia.model.service;

import com.example.trivia.model.dto.RegistrationInOutDto;
import com.example.trivia.model.dto.UserInformationInOutDto;

public interface UserInformationService {
    public void saveUserInformation(RegistrationInOutDto userInformationEntity);

    public UserInformationInOutDto getUserDetailsUsingUsername(String username);

    public UserInformationInOutDto getUserAndTheirCompletedGames(UserInformationInOutDto outDto);

}
