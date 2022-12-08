package com.example.deneme;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper extends EntityMapper<UserDTO, User>{

    UserDTO toDto(User user);
}
