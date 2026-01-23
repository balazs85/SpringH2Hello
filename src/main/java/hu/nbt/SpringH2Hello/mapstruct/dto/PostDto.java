package hu.nbt.SpringH2Hello.mapstruct.dto;

public record PostDto(
        Long id,
        String title,
        String text,
        UserSimpleDto creator
) {
}

