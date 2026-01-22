package hu.nbt.SpringH2Hello.dto;

public record UserDto(
        Long id,
        String name,
        String email
)  { }
