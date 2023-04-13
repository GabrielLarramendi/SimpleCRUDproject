package com.larramendiCrudProject.springboot.service;

import com.larramendiCrudProject.springboot.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user); //public

    User getUserById(Long id);

    List<User> getAllUsers();
}
