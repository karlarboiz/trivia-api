package com.example.trivia.obj;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserInformationObj {
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDate dob;

    private int age;

    private String username;

    private Long completedQuizzes;
}

