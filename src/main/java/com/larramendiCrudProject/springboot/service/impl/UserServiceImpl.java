package com.larramendiCrudProject.springboot.service.impl;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;
import com.larramendiCrudProject.springboot.mapper.UserMapper;
import com.larramendiCrudProject.springboot.repository.UserRepository;
import com.larramendiCrudProject.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        return savedUserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        UserDto userDto = UserMapper.mapToUserDto(optionalUser.get());
        return userDto;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> list = userRepository.findAll();
        List<UserDto> listDto = new ArrayList<>();
        for(User x : list) {
            listDto.add(UserMapper.mapToUserDto(x));
        }
        return listDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User existentUser = userRepository.findById(userDto.getId()).get();
        existentUser.setFirstName(userDto.getFirstName());
        existentUser.setLastName(userDto.getLastName());
        existentUser.setEmail(userDto.getEmail());

        User updatedUser = userRepository.save(existentUser);
        UserDto updatedUserDto = UserMapper.mapToUserDto(updatedUser);
        return updatedUserDto;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}
