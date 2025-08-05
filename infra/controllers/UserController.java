package com.joaopedro.banco_itau.infra.controllers;

import com.joaopedro.banco_itau.application.usecases.CreateUserInterector;
import com.joaopedro.banco_itau.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    private CreateUserInterector createUserInterector;
    private UserDTOMapper userDTOMapper;

    public UserController(CreateUserInterector createUserInterector, UserDTOMapper userDTOMapper) {
        this.createUserInterector = createUserInterector;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create (@RequestBody CreateUserRequest request) {
        User userBusinessObj = userDTOMapper.toUser(request);
        User user = createUserInterector.criarUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }
}
