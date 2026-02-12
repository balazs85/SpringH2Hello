package hu.nbt.SpringH2Hello.mapstruct.mapper;
import java.util.List;

import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructUser;
import org.mapstruct.Mapper;

import hu.nbt.SpringH2Hello.mapstruct.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(MapstructUser user);
    List<UserDto> toDto(List<MapstructUser> users);
}
