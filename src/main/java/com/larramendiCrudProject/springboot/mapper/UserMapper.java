package com.larramendiCrudProject.springboot.mapper;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;

public class UserMapper {

    //Converte User JPA entity para UserDto
    public static UserDto mapToUserDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }

    public static User mapToUser(UserDto userDto) {
        return new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
    }

}
