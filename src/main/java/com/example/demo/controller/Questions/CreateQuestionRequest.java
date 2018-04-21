package com.example.demo.controller.Questions;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CreateQuestionRequest {

    private String text;
    private boolean isPublished;
    private int lectureId;
    private List<CreateAnswerDTO> answers;

}
