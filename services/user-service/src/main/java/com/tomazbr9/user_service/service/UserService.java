package com.tomazbr9.user_service.service;

import com.tomazbr9.user_service.model.User;
import com.tomazbr9.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findById(Long id){
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return user;
    }

    public User createUser(User user){
        return repository.save(user);
    }
}
