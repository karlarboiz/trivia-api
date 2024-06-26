package com.example.trivia.model.service.impl;

import com.example.trivia.config.JwtService;
import com.example.trivia.model.dao.entity.UserInformation;
import com.example.trivia.model.logic.UserInformationLogic;
import com.example.trivia.model.service.AuthenticationService;
import com.example.trivia.request.RequestAuthentication;
import com.example.trivia.response.ResponseAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserInformationLogic userInformationLogic;

    @Autowired
    private JwtService jwtService;



    @Override
    public ResponseAuthentication responseAuthentication(RequestAuthentication requestAuthentication) {
        ResponseAuthentication responseAuthentication = new ResponseAuthentication();

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        requestAuthentication.getEmail(),
                        requestAuthentication.getPassword()
                )
        );


        UserInformation userInformation = userInformationLogic.matchedLoginCredentials(requestAuthentication.getEmail());

        String jwtToken =  jwtService.generateToken(userInformation);
        responseAuthentication.setValid(true);
        responseAuthentication.setToken(jwtToken);
        return responseAuthentication;


    }


}
