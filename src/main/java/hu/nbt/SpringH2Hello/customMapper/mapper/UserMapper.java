package hu.nbt.SpringH2Hello.customMapper.mapper;
import hu.nbt.SpringH2Hello.customMapper.dto.UserDto;
import hu.nbt.SpringH2Hello.customMapper.entity.CustomUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapper {

    private final PostSimpleMapper postSimpleMapper;

    public UserMapper(PostSimpleMapper postSimpleMapper) {
        this.postSimpleMapper = postSimpleMapper;
    }

    public UserDto toDto(CustomUser user) {
        if (user == null) {
            return null;
        }

        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                postSimpleMapper.toSimpleDto(user.getPosts())
        );
    }

    public List<UserDto> toDto(List<CustomUser> users) {
        if (users == null) {
            return null;
        }

        return users.stream()
                .map(this::toDto)
                .toList();
    }
}
