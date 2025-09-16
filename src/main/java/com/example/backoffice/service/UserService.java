package com.example.backoffice.service;

import com.example.backoffice.model.User;
import com.example.backoffice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() { return repository.findAll(); }
    public User findById(Long id) { return repository.findById(id).orElse(null); }
    public User save(User user) { return repository.save(user); }
    public void delete(Long id) { repository.deleteById(id); }
}
