package com.example.demo.service.lecture;

import com.example.demo.controller.Lectures.CreateLectureRequest;
import com.example.demo.controller.Lectures.LectureResponse;
import com.example.demo.controller.Lectures.UpdateLectureRequest;
import com.example.demo.entity.Lecture;
import com.example.demo.exceptions.ObjectNotFoundException;

import java.util.List;

public interface LectureService {

    LectureResponse findById(int id) throws ObjectNotFoundException;

    List<LectureResponse> findAll();

    LectureResponse save(CreateLectureRequest request);

    LectureResponse findByAbbreviation(String abbreviation) throws ObjectNotFoundException;

    LectureResponse update(UpdateLectureRequest request) throws ObjectNotFoundException;

    void deleteById(int id) throws ObjectNotFoundException;
}
