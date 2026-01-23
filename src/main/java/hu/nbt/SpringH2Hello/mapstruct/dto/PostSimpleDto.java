package hu.nbt.SpringH2Hello.mapstruct.dto;

public record PostSimpleDto(
        Long id,
        String title,
        String text
) {
}

