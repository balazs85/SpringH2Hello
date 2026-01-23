package hu.nbt.SpringH2Hello.mapper;
import hu.nbt.SpringH2Hello.dto.UserDto;
import hu.nbt.SpringH2Hello.entity.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Named("userWithPosts")
    UserDto toDto(User user);
    List<UserDto> toDto(List<User> users);

    @Named("userWithoutPosts")
    @Mapping(target = "posts", ignore = true)
    UserDto toDtoWithoutPosts(User user);

    @IterableMapping(qualifiedByName = "userWithoutPosts")
    List<UserDto> toDtoWithoutPosts(List<User> users);
}
