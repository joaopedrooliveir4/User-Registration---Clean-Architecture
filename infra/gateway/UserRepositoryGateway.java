package com.joaopedro.banco_itau.infra.gateway;

import com.joaopedro.banco_itau.application.gateways.UserGateway;
import com.joaopedro.banco_itau.domain.entity.User;
import com.joaopedro.banco_itau.infra.persistence.UserEntity;
import com.joaopedro.banco_itau.infra.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
