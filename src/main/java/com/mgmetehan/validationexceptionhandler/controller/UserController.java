package com.mgmetehan.validationexceptionhandler.controller;

import com.mgmetehan.validationexceptionhandler.dto.UserRequestDTO;
import com.mgmetehan.validationexceptionhandler.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public String createUser(@RequestBody @Valid UserRequestDTO user) {
        return userService.createUser(user);
    }
}
