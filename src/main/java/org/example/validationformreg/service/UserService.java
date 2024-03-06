package org.example.validationformreg.service;

import org.example.validationformreg.model.User;
import org.example.validationformreg.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
