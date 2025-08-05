package com.joaopedro.banco_itau.application.gateways;

import com.joaopedro.banco_itau.domain.entity.User;

public interface UserGateway {
    User createUser (User user);
}
