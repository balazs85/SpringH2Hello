package hu.nbt.SpringH2Hello.mapstruct.mapper;
import java.util.List;

import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructUser;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import hu.nbt.SpringH2Hello.mapstruct.dto.UserDto;
import hu.nbt.SpringH2Hello.mapstruct.dto.UserSimpleDto;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Named("userWithPosts")
    UserDto toDto(MapstructUser user);
    List<UserDto> toDto(List<MapstructUser> users);

    @Named("userWithoutPosts")
    UserSimpleDto toDtoWithoutPosts(MapstructUser user);
}
