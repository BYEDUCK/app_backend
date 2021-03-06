package com.example.demo.controller.Questions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateQuestionRequest {

    private int id;
    private String text;
    private boolean isPublished;
    private List<CreateAnswerDTO> answers;

}
