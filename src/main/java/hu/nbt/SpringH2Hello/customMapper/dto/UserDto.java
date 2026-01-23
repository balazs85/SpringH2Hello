package hu.nbt.SpringH2Hello.customMapper.dto;

import java.util.List;

public record UserDto(
        Long id,
        String name,
        String email,
        List<PostSimpleDto> posts
)  { }
