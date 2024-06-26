package com.example.trivia.model.dto;

import com.example.trivia.obj.RecordQuizObj;
import lombok.Data;

import java.util.List;

@Data
public class RecordQuizInOutDto {

    private List<RecordQuizObj> recordQuizObjList;


}
