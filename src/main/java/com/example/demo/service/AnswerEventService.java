package com.example.demo.service;

import com.example.demo.controller.AnswerEvent.AnswerEventRequest;
import com.example.demo.exceptions.ObjectNotFoundException;

public interface AnswerEventService {

    void save(AnswerEventRequest request) throws ObjectNotFoundException;

}
