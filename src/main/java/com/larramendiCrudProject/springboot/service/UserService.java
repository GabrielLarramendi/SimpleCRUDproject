package com.larramendiCrudProject.springboot.service;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto); //public

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long id);
}
