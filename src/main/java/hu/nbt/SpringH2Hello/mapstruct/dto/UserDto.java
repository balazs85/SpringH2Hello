package hu.nbt.SpringH2Hello.mapstruct.dto;

import java.util.List;

public record UserDto(
        Long id,
        String name,
        String email,
        List<PostWithoutCreatorDto> posts
)  { }
