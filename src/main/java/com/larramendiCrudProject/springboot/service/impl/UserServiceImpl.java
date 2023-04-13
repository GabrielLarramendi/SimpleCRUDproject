package com.larramendiCrudProject.springboot.service.impl;

import com.larramendiCrudProject.springboot.entity.User;
import com.larramendiCrudProject.springboot.repository.UserRepository;
import com.larramendiCrudProject.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
