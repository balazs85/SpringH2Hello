package hu.nbt.SpringH2Hello.mapstruct.mapper;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

import hu.nbt.SpringH2Hello.mapstruct.dto.UserDto;
import hu.nbt.SpringH2Hello.mapstruct.dto.UserSimpleDto;
import hu.nbt.SpringH2Hello.mapstruct.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Named("userWithPosts")
    UserDto toDto(User user);
    List<UserDto> toDto(List<User> users);

    @Named("userWithoutPosts")
    UserSimpleDto toDtoWithoutPosts(User user);
}
