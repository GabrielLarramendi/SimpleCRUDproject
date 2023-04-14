package com.larramendiCrudProject.springboot.service.impl;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;
import com.larramendiCrudProject.springboot.repository.UserRepository;
import com.larramendiCrudProject.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        //Converter userDto em User para salvar no banco de dados;
        User user = new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());

        User savedUser = userRepository.save(user);

        //Converter User JPA entity para UserDTO
        UserDto savedUserDto = new UserDto(
                savedUser.getId(), savedUser.getFirstName(), savedUser.getLastName(), savedUser.getEmail()
        );

        return savedUserDto;
    }

    @Override
    public User getUserById(Long userId) {
         Optional<User> optionalUser = userRepository.findById(userId);
         return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existentUser = userRepository.findById(user.getId()).get();
        existentUser.setFirstName(user.getFirstName());
        existentUser.setLastName(user.getLastName());
        existentUser.setEmail(user.getEmail());

        User updatedUser = userRepository.save(existentUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}
