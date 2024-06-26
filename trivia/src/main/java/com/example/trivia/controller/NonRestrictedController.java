package com.example.trivia.controller;

import com.example.trivia.model.dto.UserInformationInOutDto;
import com.example.trivia.model.service.UserInformationService;
import com.example.trivia.obj.UserInformationObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz/api/info")
public class NonRestrictedController {

    @Autowired
    private UserInformationService userInformationService;

    @GetMapping("/users/record")
    public ResponseEntity<List<UserInformationObj>> usersRecord(){
        UserInformationInOutDto inDto = new UserInformationInOutDto();
        UserInformationInOutDto outDto = userInformationService.getUserAndTheirCompletedGames(inDto);
        List<UserInformationObj> userInformationObjList =  outDto.getStudentObjList();


        return ResponseEntity.ok(userInformationObjList);
    }
}

