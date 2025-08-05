package com.joaopedro.banco_itau.infra.controllers;

import com.joaopedro.banco_itau.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse (User user) {
        return new CreateUserResponse(user.email());
    }

    public User toUser (CreateUserRequest request) {
        return new User(request.email(), request.senha());
    }
}
