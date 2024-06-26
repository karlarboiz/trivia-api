package com.example.trivia.request;

import lombok.Data;

@Data
public class RequestAuthentication {

    private String email;

    private String password;
}
