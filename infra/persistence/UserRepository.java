package com.joaopedro.banco_itau.infra.persistence;

import com.joaopedro.banco_itau.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
