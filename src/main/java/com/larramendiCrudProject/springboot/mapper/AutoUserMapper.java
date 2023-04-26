package com.larramendiCrudProject.springboot.mapper;

import com.larramendiCrudProject.springboot.dto.UserDto;
import com.larramendiCrudProject.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class); //Pode usar o MAPPER para chamar um desses dois metodos

    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);

}
