package hu.nbt.SpringH2Hello.mapstruct.dto;

public record PostWithoutCreatorDto(
        Long id,
        String title,
        String text
) {
}

