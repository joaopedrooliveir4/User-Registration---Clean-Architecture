package com.joaopedro.banco_itau.infra.gateway;

import com.joaopedro.banco_itau.domain.entity.User;
import com.joaopedro.banco_itau.infra.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.email(), userDomainObj.senha());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getEmail(), userEntity.getSenha());
    }
}
