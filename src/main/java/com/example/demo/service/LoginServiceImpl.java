package com.example.demo.service;

import com.example.demo.controller.Login.CreateLoginRequest;
import com.example.demo.controller.Login.LoginResponse;
import com.example.demo.entity.User;
import com.example.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResponse login(CreateLoginRequest request) {
        
        return;
    }
}
