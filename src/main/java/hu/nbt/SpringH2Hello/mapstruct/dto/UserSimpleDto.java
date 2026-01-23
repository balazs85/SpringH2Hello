package hu.nbt.SpringH2Hello.mapstruct.dto;

public record UserSimpleDto(
        Long id,
        String name,
        String email
) {
}
