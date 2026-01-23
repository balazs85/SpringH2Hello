package hu.nbt.SpringH2Hello.mapper;
import hu.nbt.SpringH2Hello.dto.UserDto;
import hu.nbt.SpringH2Hello.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    List<UserDto> toDto(List<User> users);

}
