package com.mgmetehan.validationexceptionhandler.service;

import com.mgmetehan.validationexceptionhandler.dto.UserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    public String createUser(UserRequestDTO user) {
        return "User created";
    }
}
