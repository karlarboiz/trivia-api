package com.example.trivia.controller;

import com.example.trivia.model.dto.RegistrationInOutDto;
import com.example.trivia.model.service.AuthenticationService;
import com.example.trivia.model.service.UserInformationService;
import com.example.trivia.request.RequestAuthentication;
import com.example.trivia.response.ResponseAuthentication;
import com.example.trivia.response.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/quiz/api")
public class LoginController {

    @Autowired
    private UserInformationService userInformationService;

    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<ResponseMessage<Void>> handle(@RequestBody RegistrationInOutDto userInfo){
        // Assuming saveUserInformation() method performs the save operation without returning anything
        userInformationService.saveUserInformation(userInfo);

        ResponseMessage<Void> responseMessage = new ResponseMessage<>();

        responseMessage.setSuccess(true);
        responseMessage.setMessage("It worked!");

        return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseAuthentication> loginMethod(@RequestBody RequestAuthentication requestAuthentication) throws SQLException {

        return ResponseEntity.ok(authenticationService.responseAuthentication(requestAuthentication));
    }




}
