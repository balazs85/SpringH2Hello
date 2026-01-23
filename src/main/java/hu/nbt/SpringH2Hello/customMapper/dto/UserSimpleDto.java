package hu.nbt.SpringH2Hello.customMapper.dto;

public record UserSimpleDto(
        Long id,
        String name,
        String email
)  { }
