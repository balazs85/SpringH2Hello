package hu.nbt.SpringH2Hello.customMapper.dto;

public record PostDto(
        Long id,
        String title,
        String text,
        UserSimpleDto creator
) { }

