package com.example.trivia.model.service;

import com.example.trivia.request.RequestAuthentication;
import com.example.trivia.response.ResponseAuthentication;

import java.sql.SQLException;

public interface AuthenticationService {

    public ResponseAuthentication responseAuthentication(RequestAuthentication requestAuthentication) throws SQLException;
}

