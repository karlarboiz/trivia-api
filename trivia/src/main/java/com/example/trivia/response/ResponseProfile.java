package com.example.trivia.response;

import lombok.Data;

@Data
public class ResponseProfile {

    private String username;

    private boolean isAuth;

    private String message;
}

