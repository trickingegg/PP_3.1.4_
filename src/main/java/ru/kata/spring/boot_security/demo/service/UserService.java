package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    void add(User user);

    void delete(Long id);

    void update(User user);

    User findById(Long id);

    User findByUsername(String username);
}
