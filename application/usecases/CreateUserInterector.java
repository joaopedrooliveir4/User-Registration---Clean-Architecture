package com.joaopedro.banco_itau.application.usecases;

import com.joaopedro.banco_itau.application.gateways.UserGateway;
import com.joaopedro.banco_itau.domain.entity.User;

public class CreateUserInterector {

    private UserGateway userGateway;

    public CreateUserInterector(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User criarUser (User user) {
        return userGateway.createUser(user);
    }
}
