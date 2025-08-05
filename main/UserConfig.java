package com.joaopedro.banco_itau.main;

import com.joaopedro.banco_itau.application.gateways.UserGateway;
import com.joaopedro.banco_itau.application.usecases.CreateUserInterector;
import com.joaopedro.banco_itau.infra.controllers.UserDTOMapper;
import com.joaopedro.banco_itau.infra.gateway.UserEntityMapper;
import com.joaopedro.banco_itau.infra.gateway.UserRepositoryGateway;
import com.joaopedro.banco_itau.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInterector createUserCase (UserGateway userGateway) {
        return new CreateUserInterector(userGateway);
    }

    @Bean
    UserGateway userGateway (UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper () {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper () {
        return new UserDTOMapper();
    }
}
