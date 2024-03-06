package org.example.validationformreg.repository;

import org.example.validationformreg.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}
