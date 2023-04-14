package com.larramendiCrudProject.springboot.service;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto); //public

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long id);
}
