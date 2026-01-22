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
    UserDto toDto(User user);
    List<UserDto> toDto(List<User> users);

}
