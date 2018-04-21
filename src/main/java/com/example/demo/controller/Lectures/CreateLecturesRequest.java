package com.example.demo.controller.Lectures;

import com.example.demo.entity.Lecture;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CreateLecturesRequest {
    private String name;
    private String abbreviation;
    private Day day;
    private LocalTime startHour;
    private LocalTime finishHour;

    public Lecture toLecture() {
        Lecture lecture = new Lecture();
        lecture.setName(this.name);
        lecture.setAbbreviation(this.abbreviation);
        lecture.setDay(this.day);
        lecture.setStarHour(this.startHour);
        lecture.setFinishHour(this.finishHour);
        return lecture;
    }
}