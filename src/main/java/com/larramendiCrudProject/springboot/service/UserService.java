package com.larramendiCrudProject.springboot.service;

import com.larramendiCrudProject.springboot.entity.User;

public interface UserService {

    User createUser(User user); //public

    User getUserById(Long id);
}
